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

		long maxcols = 0;
		for (long i=0; i<tbl.size(); i++) {
			IRow row = tbl.getRow(i);
			
			//It iterates over the columns.
			Long[] colidxs = row.getIndexes();
			for (long j=0; j<colidxs.length; j++) {
				buffer += String.format("|%-10s", row.getData(j));
			}//EndForJ.
			
			//It finds the max number of columns.
			if (colidxs.length > maxcols) maxcols = colidxs.length;
			
			buffer += "|\n";
		}//EndForI.
		
		//It prints the delimiters.
		String delim = "+";
		for (int i=0; i<maxcols; i++) {
			delim += "----------+";
		}
		buffer = delim + "\n" + buffer + delim + "\n";
		
		return buffer;
	}//EndMethod.
	
}//EndClass.
