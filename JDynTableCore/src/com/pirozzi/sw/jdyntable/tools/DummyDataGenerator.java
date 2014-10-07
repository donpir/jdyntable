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

package com.pirozzi.sw.jdyntable.tools;

import com.pirozzi.sw.jdyntable.impl.JDynTable;
import com.pirozzi.sw.jdyntable.model.IRow;

/**
 * It is an utility to generate a table data to use
 * within your application.
 * @author Donato Pirozzi [donatopirozzi@gmail.com]
 */
public class DummyDataGenerator {

	/**
	 * It generates a table with flag data.
	 * @return A new table.
	 */
	public JDynTable generateFlagData() {
		JDynTable tbl = new JDynTable();
		
		IRow rit = tbl.addRow();
		rit.setData(0, "Italy");
		rit.setData(1, "Europe");
		IRow rfr = tbl.addRow();
		rfr.setData(0, "Franch");
		rfr.setData(1, "Europe");
		
		return tbl;
	}//EndMethod.
	
}//EndClass.
