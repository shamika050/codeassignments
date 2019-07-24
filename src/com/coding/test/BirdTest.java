package com.coding.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.coding.main.Bird;
import com.coding.optimized.main.BirdImpl;

public class BirdTest {

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
	public void testBirdSing() {
		Object expected = String.valueOf("I am singing\r\n");
		Bird bird = new Bird();
		bird.sing();
		String outContentValue = outContent.toString();
		Object actual = String.valueOf(outContentValue);
		assertEquals("Passed : ",expected,actual);
	
	}
	
	@Test
	public void testBirdWalk() {
		Object expected = String.valueOf("I am walking\r\n");
		Bird bird = new Bird();
		bird.walk();
		String outContentValue = outContent.toString();
		Object actual = String.valueOf(outContentValue);
		assertEquals("Passed : ",expected,actual);
	
	}
	
	@Test
	public void testBirdFly() {
		Object expected = String.valueOf("I am flying\r\n");
		Bird bird = new Bird();
		bird.fly();
		String outContentValue = outContent.toString();
		Object actual = String.valueOf(outContentValue);
		assertEquals("Passed : ",expected,actual);
	
	}
	
	@After
	public void restoreStreams() {
	   System.setOut(originalOut);
	   System.setErr(originalErr);
	}
	
}
