package com.example.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> setObj=new HashSet<String>();
		setObj.add("2");
		setObj.add("3");
		setObj.add("4");
		setObj.add("5");
		setObj.add("6");
		
		System.out.println("setObj: " + setObj);
		HashMap<String,String> mapObj=  new HashMap<String,String>();
		 for (String temp : setObj) {
		        System.out.println(temp);
		        mapObj.put(temp, temp);
		        
		     }
			System.out.println("mapObj: " + mapObj);

		 



	}

}
