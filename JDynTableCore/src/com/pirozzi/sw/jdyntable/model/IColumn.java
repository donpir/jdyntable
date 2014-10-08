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
 * It is a table column.
 * @author Donato Pirozzi [donatopirozzi@gmail.com]
 * 
 */
public interface IColumn extends Serializable {

	/**
	 * A human-readable label.
	 * @return
	 */
	public String getLabel();
	
}//EndInterface.
