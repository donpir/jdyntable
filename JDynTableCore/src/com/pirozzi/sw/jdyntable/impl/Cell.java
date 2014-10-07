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

	private Object data; //Main data.
	private Map<String, Serializable> attributes = new HashMap<String, Serializable>();

	public Object getData() { return data; }
	public void setData(Object data) { this.data = data; }
	
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
