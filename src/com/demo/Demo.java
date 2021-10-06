package com.demo;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]  str = {"1,2","~","3,4"};
		for(String s: str)
		{
			String arr[]=s.split(",");
			for(String s1: str) {
				if (Integer.parseInt(s1) >=0)
				{
					System.out.println(s);
				}
			}
			
		}


	}

}
