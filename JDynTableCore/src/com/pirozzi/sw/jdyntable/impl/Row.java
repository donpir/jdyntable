package com.pirozzi.sw.jdyntable.impl;

import com.pirozzi.sw.jdyntable.model.IRow;

/**
 * It is a table row. It can contain zero, one or up to
 * <i>n</i> cells in according to the number of columns.
 * It is designed to be efficient in the sense that it uses
 * the memory only when it is needed. 
 * @author Donato Pirozzi - donatopirozzi@gmail.com
 */
class Row implements IRow {

	private JDynTable reftbl = null;
	
	/**
	 * It creates a new new row.
	 * @param reftbl Who is the row table owner?
	 */
	public Row(JDynTable reftbl) {
		this.reftbl = reftbl;
	}//EndConstructor.
	
}//EndClass.
