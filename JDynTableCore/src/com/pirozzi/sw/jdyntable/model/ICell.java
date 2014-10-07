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

package com.pirozzi.sw.jdyntable.model;

import java.io.Serializable;

/**
 * It is a cell to hold data. It can be decorated adding 
 * other information to the cell.
 * 
 * It uses the decorator design pattern to allow the
 * adding of metadata to the cell.
 * @author Donato Pirozzi - donatopirozzi@gmail.com
 */
public interface ICell {

	public Object getData();
	public void setData(Object data);
	
	public ICell put(String key, Serializable value);
	public Serializable get(String key);
	
}//EndInterface.
