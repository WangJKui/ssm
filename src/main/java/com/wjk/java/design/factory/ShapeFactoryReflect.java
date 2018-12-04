package com.wjk.java.design.factory;

public class ShapeFactoryReflect {
	//使用 反射
	public static Shape getInstance(String ClassName){
		Shape shape = null ;
		try {
			shape = (Shape) Class.forName(ClassName).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return shape;  

	}
}
