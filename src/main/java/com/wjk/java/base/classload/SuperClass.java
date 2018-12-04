package com.wjk.java.base.classload;

public class SuperClass extends SSClass{
	static
	{
		System.out.println("static SuperClass");
	}

	public static int value = 123;

	public SuperClass()
	{
		System.out.println("init SuperClass");
	}
}
