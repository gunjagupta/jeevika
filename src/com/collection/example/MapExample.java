package com.collection.example;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> mapObj=  new HashMap<Integer,String>();
		mapObj.put(1, "gunja");
		mapObj.put(2, "gunja gupta");
		mapObj.put(3, "sawan gupta");
		mapObj.put(4, "triveniganj");
System.out.println("mapObj: " + mapObj);
		
		System.out.println("mapObj get: " + mapObj.get(4));
		
		System.out.println("mapObj remove: " + mapObj.remove(3));
		
		System.out.println("new mapObj: " + mapObj);
	}

}
