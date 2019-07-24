package com.coding.add.birds;

import com.coding.add.birds.Bird;

/**
 * Chicken is a bird
 * @author shamika
 *
 */
public class Chicken implements Bird {

	@Override
	public void sing() {
		System.out.println("Chicken is singing");

	}

	/**
	 * Chicken make Cluck, cluck sound
	 */
	@Override
	public void speak() {
		System.out.println("Cluck, cluck");
		
	}


}
