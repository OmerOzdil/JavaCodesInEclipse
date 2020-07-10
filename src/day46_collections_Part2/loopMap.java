package day46_collections_Part2;

import java.util.*;

public class loopMap {

	public static void main(String[] args) {
		
		Map<String,String> dataMap = new HashMap<>();
		dataMap.put("url", "qa3.vtroiusd.com");
		dataMap.put("userName", "user66");
		dataMap.put("password", "rtew");
		dataMap.put("browers", "chorome");
		dataMap.put("storeManager", "Mike");
		dataMap.put(null, "abc");
		
		String name="browers";
		
		//keySey-> returns set with all the keys in the map.
		//values -> returns list with all the values in the map.
		
		System.out.println("KEYS");
		for(String key: dataMap.keySet()) {
			System.out.print(key+ "|");
		}
		System.out.println();
		System.out.println("VALUES");
		for(String value: dataMap.values()) {
			System.out.print(value+"|");
		}
		System.out.println();
		System.out.println("Here is the code");
		
		
		if(dataMap.containsKey(name)) {
			System.out.println(dataMap.get(name));
		}else {
			System.out.println("Not found");
		}
		
		for(String key: dataMap.keySet()) {
			System.out.println(key+ "|"+dataMap.get(key));
		}
		
		Map<Integer, Student> studentsMap = new HashMap<>();
		Map<String,String[]> data= new HashMap<>();
		Map<Integer, List<String>> data2 = new HashMap<>();
		Map<String, Map<Integer,Integer>> data3 = new HashMap<>();
		Map<String, Map<Integer,City>> data4 = new HashMap<>();
		
		
		

	}

}
