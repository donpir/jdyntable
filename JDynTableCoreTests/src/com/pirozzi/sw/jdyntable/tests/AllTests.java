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

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * The test suite for the JDynTable.
 * @author Donato Pirozzi - donatopirozzi@gmail.com
 */
public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(BasicOpCellTestCase.class);
		suite.addTestSuite(BasicOpRowTestCase.class);
		//$JUnit-END$
		return suite;
	}//EndTestSuite.

}//EndClass.
