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

package com.pirozzi.sw.jdyntable.tests.tools;

import junit.framework.TestCase;

import com.pirozzi.sw.jdyntable.impl.JDynTable;
import com.pirozzi.sw.jdyntable.tools.DummyDataGenerator;
import com.pirozzi.sw.jdyntable.tools.PrinterTools;

/**
 * 
 * @author Donato Pirozzi [donatopirozzi@gmail.com]
 */
public class PrinterToolTestCase extends TestCase {

	public void testPrint() {
		DummyDataGenerator generator = new DummyDataGenerator();
		JDynTable tbl = generator.generateFlagData();
		PrinterTools tools = new PrinterTools();
		String toprint = tools.stringify(tbl);
		System.out.println(toprint);
	}//EndMethod.
	
}//EndClass.
