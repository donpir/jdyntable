package com.pirozzi.sw.jdyntable.tests;

import junit.framework.TestCase;

import com.pirozzi.sw.jdyntable.impl.JDynTable;
import com.pirozzi.sw.jdyntable.model.IRow;

/**
 * It tests the basic operations about the table rows.
 * @author Donato Pirozzi - donatopirozzi@gmail.com
 */
public class BasicOpRowTestCase extends TestCase {

	private JDynTable tbl = null;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		tbl = new JDynTable();
	}//EndSetUp.

	public void testAddRow() {
		//*TEST*
		//It adds a new row.
		IRow r1 = tbl.addRow();
		r1.setData(0, "Italianish");
		assertEquals(1, tbl.size());
	}//EndTest
	
	public void testReplaceRow() {
		//*PRE*
		testAddRow();
		assertEquals(1, tbl.size());
		
		//*TEST*
		//It tries to replace the existing row.
		IRow r2 = tbl.replaceRow(0);
		r2.setData(0, "Italy");
		assertEquals(1, tbl.size());
	}//EndTest.
	
}//EndClass. 
