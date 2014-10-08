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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pirozzi.sw.jdyntable.model.IColumn;
import com.pirozzi.sw.jdyntable.model.IRow;

/**
 * A fast dynamic data structure to store data and access
 * them as a table. Rows are dynamic, instead the column must 
 * be fixed.
 * 
 * It comes very useful especially for the sparse tables.
 * 
 * Interesting features are:
 * 	- it is designed to be serialised;
 * 
 * @author Donato Pirozzi - donatopirozzi@gmail.com
 */
public class JDynTable {
	
	private Map<Long, Column> columns = new HashMap<Long, Column>();
	private Map<Long, Row> rows = new HashMap<Long, Row>();
	private long maxrowindex = 0;
	private long maxcolindex = 0;
	
	/**
	 * It creates a new row for the table and 
	 * attaches it to this table at the specified index.
	 * 
	 * <b>Important:</b> the other rows index are not changed, 
	 * so if another row exists with the same index, it will replace
	 * the previous one.
	 * @return
	 */
	public synchronized Row replaceRow(long index) {
		Row r = new Row(this);
		rows.put(index, r);
		if (index > maxrowindex) maxrowindex = index;
		return r;
	}//EndMethod.
	
	/**
	 * It creates a new row and adds it at the 
	 * end of the table.
	 * @return
	 */
	public synchronized Row addRow() {
		Row r = new Row(this);
		rows.put(maxrowindex, r);
		maxrowindex++;
		return r;
	}//EndMethod.
	
	/**
	 * It gets the row at the desired index.
	 * @param index 
	 * @return The row at the desired index.
	 */
	public IRow getRow(long index) {
		Row r = rows.get(index);
		
		return r;
	}//EndMethod.
	
	public long size() { return rows.size(); }//EndMethod.
	
	/**
	 * It creates a new column and adds it at the end.
	 * @return
	 */
	public IColumn addColumn() {
		Column c = new Column(this);
		columns.put(maxcolindex, c);
		maxcolindex++;
		return c;
	}//EndMehtod.
	
	/**
	 * It returns the column of table that has the provided index.
	 * @param idxcol
	 * @return  
	 */
	public IColumn getColumn(long idxcol) {
		return columns.get(idxcol);
	}//EndMethod.
	
	public long getNumColumns() {
		return columns.size();
	}//EndMethod.
	
}//EndClass.
