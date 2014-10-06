package com.pirozzi.sw.jdyntable.impl;

/**
 * A fast dynamic data structure to store data and access
 * them as a table. Rows are dynamic, instead the column must 
 * be fixed. 
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
