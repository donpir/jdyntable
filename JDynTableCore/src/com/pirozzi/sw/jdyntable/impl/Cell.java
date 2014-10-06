/*	 
 *	Copyright (c) 2014, Donato Pirozzi
 *     
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *      
 *  Contributors:
 *   	- Donato Pirozzi [dpirozzi@unisa.it]
 *   
 */

package com.pirozzi.sw.jdyntable.impl;

import com.pirozzi.sw.jdyntable.model.ICell;

/**
 * It is a cell to hold data.
 * @author Donato Pirozzi - donatopirozzi@gmail.com
 */
class Cell implements ICell {

	private Object data;

	public Object getData() { return data; }
	public void setData(Object data) { this.data = data; }
	
}//EndClass.
