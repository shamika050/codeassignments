package com.coding.add.birds;

/**
 * Animals can walk
 * @author shamika
 *
 */
public interface Animal {

	default void walk() {
		System.out.println("I am walking");
	}
	
}
