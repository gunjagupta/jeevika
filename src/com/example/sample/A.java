package com.example.sample;

public class A {

	//int i;
//  	int i; default : 0
	//int i=3;
	//void disp()
//	String s;
//	boolean b;
	//inner content
	class B{
		int j=3;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aObj=new A();
		B bObj=aObj.new B();
		System.out.println(bObj.j);
	}

}
