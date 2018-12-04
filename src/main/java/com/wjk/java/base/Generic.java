package com.wjk.java.base;

import java.util.ArrayList;
import java.util.List;

public class Generic<T> {

	public void testGeneric() {
		//上边界通配符
		List<? extends Number> list = new ArrayList<>();
		
		//list.add(123);
		
		Number b = list.get(0);
		
		//下边界通配符
		List<? super Number> list1 = new ArrayList<>();

		list1.add(123);
		
		Object  i = list1.get(0);
	}
	
	public void testGenericT(T t) {
		List<? extends T> list = new ArrayList<>();
		
		//list.add(123); 不可以set
		
		T ti = list.get(0);
		
		List<? super T> list1 = new ArrayList<>();

		list1.add(t);//可以set
		
		Object  i = list1.get(0);//只能get  Object类型
	}
}
