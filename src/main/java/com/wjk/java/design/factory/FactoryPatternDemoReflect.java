package com.wjk.java.design.factory;

public class FactoryPatternDemoReflect {
	public static void main(String[] args) {
		Shape circle = ShapeFactoryReflect.
				getInstance("com.wjk.java.design.factory.Circle");
		circle.draw();
		
		Shape rectangle = ShapeFactoryReflect.
				getInstance("com.wjk.java.design.factory.Rectangle");
		rectangle.draw();
		
		Shape square = ShapeFactoryReflect.
				getInstance("com.wjk.java.design.factory.Square");
		square.draw();
	}
}
