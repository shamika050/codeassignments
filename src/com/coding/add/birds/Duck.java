package com.coding.add.birds;

import com.coding.add.birds.Bird;

/**
 * Duck is a bird which can fly and swim.
 * @author shamika
 *
 */
public class Duck implements Bird, FlyingAnimal, SwimmingAnimal {

	@Override
	public void swim() {
		System.out.println("Duck is swimming");

	}

	@Override
	public void fly() {
		System.out.println("Duck is flying");

	}

	@Override
	public void sing() {
		System.out.println("Duck is singing");

	}

	/**
	 * Chicken make Quack, quack sound
	 */
	@Override
	public void speak() {
		System.out.println("Quack, quack");
		
	}

}
