package com.coding.test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.butterfly.Butterfly;
import com.butterfly.Caterpillar;
import com.butterfly.Flyable;
import com.butterfly.Metamorphosis;


public class ButterflyTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;
	
	@Before
	public void setUpStreams() {
	   System.setOut(new PrintStream(outContent));
	   System.setErr(new PrintStream(errContent));
	}
	
	@Test
	public void testButterflySing() {

		Butterfly butterfly = new Butterfly();
		butterfly.setName("Beauty");
		
		Metamorphosis metamorphosis = new Metamorphosis(butterfly);
		
		assertEquals("Passed : ","Beauty",metamorphosis.getName());
		
		Caterpillar caterpillar = metamorphosis.makeMeCatapilar();
		caterpillar.crawl();
		assertEquals("Passed : ","Caterpillar is crawling\r\n",outContent.toString());
		assertEquals("Passed : ","Beauty",caterpillar.getName());
	
	}
	
	@After
	public void restoreStreams() {
	   System.setOut(originalOut);
	   System.setErr(originalErr);
	}
	
}
