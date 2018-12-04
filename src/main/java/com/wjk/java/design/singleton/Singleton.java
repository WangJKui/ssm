package com.wjk.java.design.singleton;

/**
 * 懒汉，线程不安全
 * @author h
 *
 */
public class Singleton {  
	private static Singleton instance;  
	private Singleton (){}  

	public static Singleton getInstance() {  
		if (instance == null) {  
			instance = new Singleton();  
		}  
		return instance;  
	}  
} 