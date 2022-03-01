package learn.console.BadriJava.collect;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;
import java.util.TreeMap;

/*
 * Map:<k,v>
 * HashMap, Hashtable(sync,11bits)>> random
 * TreeMap						  >> ascending
 * 
 * put
 * putAll
 * 
 * get
 * 
 * containsKey
 * containsValue
 * 
 * remove(key)
 * 
 * keySet
 * values
 */

public class DemoMaps 
{
	public static void main(String[] args) 
	{
		Hashtable<Integer, String> ipl=new Hashtable<Integer, String>();
		ipl.put(2010, "CSK");
		ipl.put(2007, "Deccan charges");
		ipl.put(2021, "CSK");
		ipl.put(2020, "MI");
		ipl.put(2008, "Rajasthan royals");
		ipl.put(2009, "Delhi");
		System.out.println(ipl);
		TreeMap<Integer, String> premier=new TreeMap<Integer, String>();
		premier.putAll(ipl);
		System.out.println(premier);
		
		ipl.remove(2007);
		
		System.out.println(premier.containsValue("Deccan charges"));
		
		System.out.println(ipl.containsKey(2007));
		
		System.out.println(premier.get(2007));
		
		//System.out.println(premier.keySet());
		
		Set<Integer> k=premier.keySet();
		
		System.out.println(k);
		
		Collection<String> v=ipl.values();
		
		System.out.println(v);
	}
}
