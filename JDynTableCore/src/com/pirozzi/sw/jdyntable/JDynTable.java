package com.pirozzi.sw.jdyntable;

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
	
}//EndClass.
