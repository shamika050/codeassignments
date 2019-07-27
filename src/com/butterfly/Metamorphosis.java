package com.butterfly;


public class Metamorphosis extends Butterfly implements Flyable {
	
	private Butterfly butterfly;
	
	@Override
	public void fly() {
		System.out.println("Metamorphosis is flying");
		
	}
	
	public Metamorphosis(Butterfly butterfly) {
		this.setButterfly(butterfly);
		this.setName(butterfly.getName());
	}

	public Caterpillar makeMeCatapilar() {
		Caterpillar catapilar = new Caterpillar();
		catapilar.setName(butterfly.getName());
		return catapilar;
		
	}

	public Butterfly getButterfly() {
		return butterfly;
	}

	public void setButterfly(Butterfly butterfly) {
		this.butterfly = butterfly;
	}

}
