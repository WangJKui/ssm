package com.wjk.test.java8;

import java.util.function.Supplier;

public class CarTest {
	public static CarTest create( final Supplier< CarTest > supplier ) {
		return supplier.get();
	}              

	public static void collide( final CarTest car ) {
		System.out.println( "Collided " + car.toString() );
	}

	public void follow( final CarTest another ) {
		System.out.println( "Following the " + another.toString() );
	}

	public void repair() {   
		System.out.println( "Repaired " + this.toString() );
	}
}
