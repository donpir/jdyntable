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

import com.pirozzi.sw.jdyntable.model.IColumn;

/**
 * 
 * @author Donato Pirozzi [donatopirozzi@gmail.com]
 *
 */
class Column implements IColumn {
	private static final long serialVersionUID = 1L;

	private String label;
	
	@Override
	public String getLabel() { return label; }//EndMethod.

}//EndClass.
