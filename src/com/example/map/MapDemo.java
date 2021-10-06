package com.example.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> mapObj = new HashMap<Integer, String>();
		mapObj.put(1, "gunja");
		mapObj.put(2, "gunja gupta");
		mapObj.put(3, "sawan gupta");
		mapObj.put(4, "triveniganj");
		mapObj.put(5, "jaynagar");
		mapObj.put(6, "jaynagar");

		Set<String> setObj = new HashSet<String>();

		System.out.println("mapObj: " + mapObj);
		for (String Capital : mapObj.values()) { // using values() for iteration over keys
			System.out.println("Capiatl: " + Capital);
			setObj.add(Capital);

		}

		System.out.println("setObj: " + setObj);
	}

}
