package com.coding.optimized.main;

public interface Animal {

	default void walk() {
		System.out.println("I am walking");
	}
	
}
