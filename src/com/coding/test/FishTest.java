package com.coding.test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.coding.add.birds.Clownfish;
import com.coding.add.birds.Dolphin;
import com.coding.add.birds.Fish;
import com.coding.add.birds.Shark;
import com.coding.add.birds.SwimmingAnimal;

public class FishTest {
	
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
	public void testShark() {
		Object expected = String.valueOf("Shark is swimming\r\n");
		Fish shark = new Shark();
		shark.setColor("grey");
		shark.setEatOtherFish(true);
		shark.setSize("large");
		
		shark.swim();
		String outContentValue = outContent.toString();
		Object actual = String.valueOf(outContentValue);
		assertEquals("Passed : ",expected,actual);
	
	}
	
	@Test
	public void testClownFish() {
		Object expected = String.valueOf("ClownFish is swimming\r\n");
		Fish clownFish = new Clownfish();
		clownFish.setColor("grey");
		clownFish.setIsMakeJokes(true);
		clownFish.setSize("small");
		
		
		clownFish.swim();
		String outContentValue = outContent.toString();
		Object actual = String.valueOf(outContentValue);
		assertEquals("Passed : ",expected,actual);
	
	}
	
	@Test
	public void testDolphinFish() {
		Object expected = String.valueOf("Dolphin is swimming\r\n");
		SwimmingAnimal dolphin = new Dolphin();
		dolphin.swim();
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
