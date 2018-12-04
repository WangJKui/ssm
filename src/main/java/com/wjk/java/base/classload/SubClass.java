package com.wjk.java.base.classload;

public class SubClass extends SuperClass
{
	static
	{
		System.out.println("static SubClass");
	}

	{
		System.out.println("无static SubClass");
	}
	static int a;

	public SubClass()
	{
		System.out.println("init SubClass");
	}
}