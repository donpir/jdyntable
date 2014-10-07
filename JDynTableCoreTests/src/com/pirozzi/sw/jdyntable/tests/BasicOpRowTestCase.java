/*	 
 *	Copyright (c) 2014, Donato Pirozzi
 *     
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *      
 *  Contributors:
 *   	- Donato Pirozzi [donatopirozzi@gmail.com]
 *   
 */

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
		assertNotNull(r1);
		assertEquals(1, tbl.size());
	}//EndTest
	
	public void testReplaceRow() {
		//*PRE*
		testAddRow();
		assertEquals(1, tbl.size());
		
		//*TEST*
		//It tries to replace the existing row.
		IRow r2 = tbl.replaceRow(0);
		assertNotNull(r2);
		assertEquals(1, tbl.size());
	}//EndTest.
	
	public void testGetRow() {
		//*PRE*
		testReplaceRow();
		
		//*TEST*
		IRow r0 = tbl.getRow(0);
		assertNotNull(r0);
		IRow r1 = tbl.getRow(1);
		assertNull(r1);
	}//EndTest.
	
}//EndClass. 
