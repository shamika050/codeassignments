package com.coding.add.birds;

/**
 * Rooster is also a chicken and they speak differently.
 * @author shamika
 *
 */
public class Rooster {
	
	private Chicken chicken = new Chicken();
	
	public void sing() {
		chicken.sing();
	}

	public void speak() {
		System.out.println("Cock-a-doodle-doo");
		
	}
	

}
