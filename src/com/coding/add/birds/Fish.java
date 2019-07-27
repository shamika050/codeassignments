package com.coding.add.birds;

public class Fish implements SwimmingAnimal {
	
	private String size;
	
	private String color;
	
	private Boolean isMakeJokes;
	
	private boolean isEatOtherFish;

	@Override
	public void swim() {
		System.out.println("Fish is swimming");

	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isEatOtherFish() {
		return isEatOtherFish;
	}

	public void setEatOtherFish(boolean isEatOtherFish) {
		this.isEatOtherFish = isEatOtherFish;
	}

	public Boolean getIsMakeJokes() {
		return isMakeJokes;
	}

	public void setIsMakeJokes(Boolean isMakeJokes) {
		this.isMakeJokes = isMakeJokes;
	}

}
