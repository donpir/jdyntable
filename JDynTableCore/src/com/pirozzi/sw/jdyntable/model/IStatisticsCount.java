package com.pirozzi.sw.jdyntable.model;

import java.io.Serializable;

/**
 * 
 * @author Donato Pirozzi [donatopirozzi@gmail.com]
 *
 */
public interface IStatisticsCount extends Serializable {

	public long statHowMany(Object o);
	
	public void statInserted(Object o);
	
	public void statRemoved(Object o);
	
	public Object[] getUniqueItems();
	
}//EndInterfae.
