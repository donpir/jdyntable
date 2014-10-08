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

package com.pirozzi.sw.jdyntable.impl;

import java.util.HashMap;
import java.util.Map;

import com.pirozzi.sw.jdyntable.model.IColumn;
import com.pirozzi.sw.jdyntable.model.IStatisticsCount;
import com.pirozzi.sw.jdyntable.model.baseimpl.BaseStatisticsCount;

/**
 * It is the implementation for a table column.
 * @author Donato Pirozzi [donatopirozzi@gmail.com]
 *
 */
class Column implements IColumn {
	private static final long serialVersionUID = 1L;

	private JDynTable reftbl;
	private String label;
	private IStatisticsCount statsCount = new BaseStatisticsCount();
	
	public Column(JDynTable table) {
		this.reftbl = table;
	}//EndConstructor.
	
	@Override
	public String getLabel() { return label; }//EndMethod.

	public IStatisticsCount getStatsCount() { return statsCount; }

}//EndClass.
