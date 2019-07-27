package com.butterfly;

public class Caterpillar extends Butterfly implements Crawlable{
	
	public Caterpillar() {
		super();
	}

	@Override
	public void crawl() {
		System.out.println("Caterpillar is crawling");
		
	}

}
