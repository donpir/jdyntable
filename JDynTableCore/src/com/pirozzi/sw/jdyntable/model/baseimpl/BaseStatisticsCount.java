package com.pirozzi.sw.jdyntable.model.baseimpl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.pirozzi.sw.jdyntable.model.IStatisticsCount;

/**
 * 
 * @author Donato Pirozzi [donatopirozzi@gmail.com]
 *
 */
public class BaseStatisticsCount implements IStatisticsCount {
	private static final long serialVersionUID = 1L;
	
	private Map<Object, Long> itemFrequency = new HashMap<Object, Long>();
	
	@Override
	public long statHowMany(Object o) {
		return itemFrequency.get(o);
	}//EndMethod.

	@Override
	public void statInserted(Object o) {
		if (o instanceof Serializable == false) 
			throw new IllegalArgumentException("The object must be serializable");
		
		Long freq = itemFrequency.get(o);
		if (freq == null)
			freq = new Long(0);
		
		//Updates the frequency.
		freq++; 
		itemFrequency.put(o, freq);
	}//EndMethod.

	@Override
	public void statRemoved(Object o) {
		if (o instanceof Serializable == false)
			throw new IllegalArgumentException("The object must be serializable");
		
		Long freq = itemFrequency.get(o);
		if (freq == null)
			freq = new Long(1);
		
		//Updates the frequency.
		freq--; 
		itemFrequency.put(o, freq);
	}//EndMethod.

	@Override
	public Object[] getUniqueItems() {
		Set<Object> items = itemFrequency.keySet();
		return items.toArray();
	}//EndMethod.

}//EndClass.
