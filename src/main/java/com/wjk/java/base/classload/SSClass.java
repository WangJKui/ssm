package com.wjk.java.base.classload;

public class SSClass{
	
	static{
		System.out.println("static SSClass");
	}
	{
		System.out.println("无无无无static SSClass");
	}
	public SSClass() {
		System.out.println("SSClass");
	}
}   