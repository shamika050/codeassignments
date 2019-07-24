package com.coding.add.birds;

import com.coding.add.birds.Bird;

public class Parrot implements Bird, FlyingAnimal {
	
	private String noiseAround;
	
	public Parrot(String noiseAround) {
		this.noiseAround = noiseAround;
	}

	@Override
	public void fly() {
		System.out.println("Parrot is flying");

	}

	@Override
	public void sing() {
		System.out.println("Parrot is singing");

	}

	@Override
	public void speak() {
		System.out.println(noiseAround);		
	}

}
