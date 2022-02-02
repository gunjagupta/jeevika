package com.collection.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap mapObj=  new HashMap();
		int i=10;
		
		Map mapObj=  new HashMap();
		mapObj.put("emp123", "gunja");
		mapObj.put(1, "gunja gupta");
		mapObj.put("emp125", "sawan gupta");
		mapObj.put("852139", "triveniganj");
		
		System.out.println("mapObj: " + mapObj);
		
		System.out.println("mapObj get: " + mapObj.get("852139"));
		
		System.out.println("mapObj size: " + mapObj.size());
		System.out.println("mapObj remove: " + mapObj.remove("852139"));
		
		System.out.println("new mapObj: " + mapObj);
		
		//
		List listObj=new ArrayList<>();
		listObj.add(2);
		listObj.add(2);
		listObj.add(3);
		listObj.add(4);
		listObj.add(5);
		System.out.println("listObj: " + listObj);
		System.out.println(" listObj size: " + listObj.size());
		listObj.remove(0);
		System.out.println("new listObj: " + listObj);
		System.out.println("new listObj size: " + listObj.size());
		
		
		Set setObj=new HashSet<>();
		setObj.add(2);
		setObj.add(2);
		setObj.add(3);
		setObj.add(4);
		setObj.add(5);
		
		System.out.println("setObj: " + setObj);

	}

}
