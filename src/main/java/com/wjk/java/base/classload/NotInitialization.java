package com.wjk.java.base.classload;
 
public class NotInitialization{
	
	public static void main(String[] args) {
//		System.out.println(SubClass.value);
		
		new SubClass();
		new SubClass();
	}
}