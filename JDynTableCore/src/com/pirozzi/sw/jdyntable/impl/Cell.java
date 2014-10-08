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
	private Object data; //Main data.
	private Map<String, Serializable> attributes = new HashMap<String, Serializable>();

	public Cell(JDynTable table, Row row) {
		this.reftbl = table;
		this.refrow = row;
	}//EndConstructor.
	
	public Object getData() { return data; }
	public void setData(Object data) { 
		//It checks if the object is serializable.
		if (data instanceof Serializable == false)
			throw new IllegalArgumentException("The object within a cell must be serializable.");
		
		//It sets the data.
		this.data = data; 
		
		//It updates the column.
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
