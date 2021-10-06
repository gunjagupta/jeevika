package com.example.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj1=new Employee("gunja123","gunja",50000000);
		Employee obj2=new Employee("gunja124","gunja",50000000);
		System.out.println("obj1: " + obj1);
		System.out.println("obj2: " + obj2);
		Map<Integer,Employee> mapObj=new HashMap<Integer,Employee>();
       
       mapObj.put(123, obj1);
       mapObj.put(124, obj2);
       System.out.println(mapObj);
       System.out.println(mapObj.get(123).getEmpId());
       System.out.println(mapObj.get(123).getEmpName());

		Set setObj=new HashSet<>();
		setObj.add(obj1);
		setObj.add(obj2);
		System.out.println("setObj: " + setObj);
		
		setObj.remove(obj1);
		System.out.println("setObj: " + setObj);
		
		
	}

}
