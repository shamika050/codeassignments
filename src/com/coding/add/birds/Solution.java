package com.coding.add.birds;

public class Solution {

	public static void main(String[] args) {
		// Assignment 2
		Bird duck = new Duck();
		Bird chicken = new Chicken();
		duck.speak();
		chicken.speak();
		
		// Assignment 3
		Rooster rooster = new Rooster();
		rooster.speak();
		
		// Assignment 4
		Parrot parrotNearDogs = new Parrot("Woof, woof");
		Parrot parrotNearCats = new Parrot("Meow");
		Parrot parrotNearRooster = new Parrot("Cock-a-doodle-doo");
		
		parrotNearDogs.speak();
		parrotNearCats.speak();
		parrotNearRooster.speak();
		

	}

}
