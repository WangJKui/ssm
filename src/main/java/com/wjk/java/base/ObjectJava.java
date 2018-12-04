package com.wjk.java.base;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class ObjectJava {

	@Test
	public void testObjectJava1() {
		String o = "123";
		testObj(o,o);
	}
	
	public static void testObj(String... obj) {
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i].toString());

		}
		
	}
}
