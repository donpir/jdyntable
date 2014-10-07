/*	 
 *	Copyright (c) 2014, Donato Pirozzi
 *     
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *      
 *  Contributors:
 *   	- Donato Pirozzi [donatopirozzi@gmail.it]
 *   
 */

package com.pirozzi.sw.jdyntable.model;

public interface IRow {
	
	public ICell setData(long idxcol, Object obj);
	
	/**
	 * 
	 * @param idxcol Column index.
	 * @return The object or null.
	 */
	public Object getData(long idxcol);
	
	/**
	 * It returns the indexes of the filled columns of this row.
	 * @return
	 */
	public Long[] getIndexes();
		
}//EndInterface.
