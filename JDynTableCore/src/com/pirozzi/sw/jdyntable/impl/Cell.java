/*	 
 *	Copyright (c) 2014, Donato Pirozzi
 *     
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *      
 *  Contributors:
 *   	- Donato Pirozzi [donatopirozzi@gmail.it]
 *   
 */

package com.pirozzi.sw.jdyntable.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.pirozzi.sw.jdyntable.model.ICell;

/**
 * It is a cell to hold data.
 * @author Donato Pirozzi - donatopirozzi@gmail.com
 */
class Cell implements ICell {

	private static final long serialVersionUID = 1L;
	
	private JDynTable reftbl;
	private Row refrow;
	private Column refcol;
	
	private Object data; //Main data.
	private Map<String, Serializable> attributes = new HashMap<String, Serializable>();

	public Cell(JDynTable table, Row row, Column col) {
		this.reftbl = table;
		this.refcol = col;
		this.refrow = row;
	}//EndConstructor.
	
	public Object getData() { return data; }
	public synchronized void setData(Object data) { 
		//It checks if the object is serializable.
		if (data instanceof Serializable == false)
			throw new IllegalArgumentException("The object within a cell must be serializable.");
		
		//It is removing the old data, so it updates the column statistics.
		refcol.getStatsCount().statRemoved(this.data);
		
		//It sets the data.
		this.data = data; 
		
		//It is adding a new data, so it updates the column statistics.
		refcol.getStatsCount().statInserted(this.data);
	}//EndMehtod.
	
	@Override
	public ICell put(String key, Serializable value) {
		attributes.put(key, value);
		return this;
	}//EndMethod.
	
	@Override
	public Serializable get(String key) {
		return attributes.get(key);
	}//EndMethod.
	
}//EndClass.
