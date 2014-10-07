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
 * A collection of tools to improve the use of table.
 * @author Donato Pirozzi [donatopirozzi@gmail.com]
 */
public class PrinterTools {

	/**
	 * It reads the table and creates a printable representation.
	 * @param tbl Table to print.
	 * @return String that shows the data in the table.
	 */
	public String stringify(JDynTable tbl) {
		String buffer = "";
		
		buffer += "+---------------------------------------------------+\n";
		for (long i=0; i<tbl.size(); i++) {
			IRow row = tbl.getRow(i);
			buffer += String.format("|%-25s|%-10s|\n", row.getData(0), row.getData(1));
		}//EndFor.
		buffer += "+---------------------------------------------------+\n";
		
		return buffer;
	}//EndMethod.
	
}//EndClass.
