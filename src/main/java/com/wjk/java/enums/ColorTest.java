package com.wjk.java.enums;

import org.junit.Test;

import com.wjk.java.design.singleton.Singleton6;

public class ColorTest {
	
	@Test
	public void testColor() {
		Color c = Color.BLANK;
		
		System.out.println(c.name());
		System.out.println(c.ordinal());

		Singleton6 b = Singleton6.INSTANCE;
		
		ColorTest [] a = new ColorTest[2];
	}
}
