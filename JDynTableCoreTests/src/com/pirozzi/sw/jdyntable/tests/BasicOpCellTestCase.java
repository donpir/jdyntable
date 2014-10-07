package com.pirozzi.sw.jdyntable.tests;

import junit.framework.TestCase;

import com.pirozzi.sw.jdyntable.impl.JDynTable;
import com.pirozzi.sw.jdyntable.model.IRow;

/**
 * 
 * @author Donato Pirozzi - donatopirozzi@gmail.com
 */
public class BasicOpCellTestCase extends TestCase {

	private JDynTable tbl = null;
	private IRow row = null;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		tbl = new JDynTable();
		row = tbl.addRow();
	}//EndConstructor.
	
	public void testSetData() {
		//*TEST*
		row.setData(0, "Italianish");
		Object obj = row.getData(0);
		assertNotNull(obj);
		assertEquals("Italianish", obj);
	}//EndMethod.
	
}//EndClass.