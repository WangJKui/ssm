package com.wjk.test.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

public class java8Test {
	public static void main(String args[]){

		List<String> names1 = new ArrayList<String>();
		names1.add("Google ");
		names1.add("Runoob ");
		names1.add("Taobao ");
		names1.add("Baidu ");
		names1.add("Sina ");

		List<String> names2 = new ArrayList<String>();
		names2.add("Google ");
		names2.add("Runoob ");
		names2.add("Taobao ");
		names2.add("Baidu ");
		names2.add("Sina ");

		java8Test tester = new java8Test();
		System.out.println("使用 Java 7 语法: ");

		tester.sortUsingJava7(names1);
		System.out.println(names1);
		System.out.println("使用 Java 8 语法: ");

		tester.sortUsingJava8(names2);
		System.out.println(names2);
	}

	// 使用 java 7 排序
	private void sortUsingJava7(List<String> names){   

		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});
	}

	// 使用 java 8 排序
	private void sortUsingJava8(List<String> names){
		Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
	}


	@Test
	public void testRunnable(){
		// Java 8之前：
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Before Java8, too much code for too little to do");
				threadSys();
			}
		}).start();
		
		//java8 
		new Thread(()-> System.out.println("Java8")).start();
		
		new Thread(()-> threadSys()).start();

	}

	protected void threadSys() {
		System.out.println("9999999999");
	}
	
	
	@Test
	public void testList(){
		// Java 8之后：
		List features = Arrays.asList("1", "3", "5", "2");
		features.forEach(n -> System.out.println(n));
		System.out.println("==============");
		// 使用Java 8的方法引用更方便，方法引用由::双冒号操作符标示，
		// 看起来像C++的作用域解析运算符
		features.forEach(System.out::println);
		System.out.println("==============");

		features.forEach(n ->listSys(n));
	}

	private Object listSys(Object n) {
		System.out.println(n.toString());
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
}













