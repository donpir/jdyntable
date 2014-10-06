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

/**
 * A fast dynamic data structure to store data and access
 * them as a table. Rows are dynamic, instead the column must 
 * be fixed.
 * 
 * It comes very useful especially for the sparse tables.
 * @author Donato Pirozzi - donatopirozzi@gmail.com
 */
public class JDynTable {

	/**
	 * It creates a new row for the table and 
	 * attaches it to this table at the specified index.
	 * @return
	 */
	public Row addRow(int index) {
		Row r = new Row(this);
		return r;
	}//EndMethod.
	
	/**
	 * It creates a new row and adds it at the 
	 * end of the table.
	 * @return
	 */
	public Row addRow() {
		Row r = new Row(this);
		return r;
	}//EndMethod.
	
}//EndClass.
