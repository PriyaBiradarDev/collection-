package com.priIt.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapItrate {
public static void main(String[] args) {
	Map<Integer, Object> map= new HashMap<Integer, Object>();
	map.put(01, "Priya");
	map.put(02, "prerna");
	map.put(03, "PINKI");
	map.put(04, "Pamu");
	
	System.out.println(map);
	


for(Entry<Integer, Object> entry:map.entrySet())
	System.out.println("Key = " + entry.getKey() + 
                 ", Value = " + entry.getValue()); 






	
}
}
