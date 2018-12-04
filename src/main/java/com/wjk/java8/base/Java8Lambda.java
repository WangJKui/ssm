package com.wjk.java8.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Java8Lambda {

	@Test
	public void testLambda() {
		Arrays.asList( "a", "b", "d" ).forEach( e -> {
			System.out.print( e );
		} );
	}
	
	@Test
	public void testLambdaObj() {
		List<Person> list = new ArrayList<Person>();
		
		Person s1 = new Person("1","one","河南");
		Person s2 = new Person("2","two","河北");
		Person s3 = new Person("3","three","湖南");
		Person s4 = new Person("4","third","湖北");

		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);

		List<Student> list1 = new ArrayList<Student>();

		Student q1 = new Student("1","one","12","110");
		Student q2 = new Student("2","two","14","112");
		Student q3 = new Student("3","three","22","119");
		Student q4 = new Student("4","third","31","117");

		list1.add(q1);
		list1.add(q2);
		list1.add(q3);
		list1.add(q4);
		
		list.forEach((Person p)->{
			if("1".equals(p.getId())) {
				System.out.println("111111111");
				p.setAddress("广西广东山西山东");
//				return;
			}
			list1.forEach((Student s)->{
				
				if(p.getId().equals(s.getId())) {
					p.setAddress(p.getAddress()+",电话："+s.getTel()+",年龄："+s.getAge());
					return;
				}
				System.out.println(s.toString());
			});
			System.out.println(p.toString());
		});
		
		
	}
}
