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

import java.util.HashMap;
import java.util.Map;

import com.pirozzi.sw.jdyntable.model.ICell;
import com.pirozzi.sw.jdyntable.model.IRow;

/**
 * It is a table row. It can contain zero, one or up to
 * <i>n</i> cells in according to the number of columns.
 * It is designed to be efficient in the sense that it uses
 * the memory only when it is needed. 
 * 
 * <b>Implementation details:</b> internally, it uses
 * a map to store partial data.
 * @author Donato Pirozzi - donatopirozzi@gmail.com
 */
class Row implements IRow {

	private JDynTable reftbl = null;
	private Map<Long, ICell> rowcontent = new HashMap<Long, ICell>(); 
	
	/**
	 * It creates a new new row.
	 * @param reftbl Who is the row table owner?
	 */
	public Row(JDynTable reftbl) {
		this.reftbl = reftbl;
	}//EndConstructor.

	@Override
	public ICell setData(long idxcol, Object obj) {
		ICell cell = rowcontent.get(idxcol);
		if (cell == null) {
			cell = new Cell();
			rowcontent.put(idxcol, cell);
		}
		
		cell.setData(obj);
		
		return cell;
	}//EndMethod.

	@Override
	public Object getData(long idxcol) {
		ICell cell = rowcontent.get(idxcol);
		if (cell == null) return null;
		return cell.getData();
	}//EndMethod.
	
}//EndClass.
