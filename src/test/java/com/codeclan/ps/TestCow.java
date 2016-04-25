package com.codeclan.ps;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCow {

	@Test 
	public void TestCowHasType() {
		Cow c = new Cow();
		assertEquals(c.getType(), "Cow");
	}
	
	@Test 
	public void TestCowHasValue() {
		Cow c = new Cow();
		assertEquals(c.getValue(), 20);
	}
	
	@Test 
	public void TestCowCanFeed ( ) {
		Cow c = new Cow();
		c.feed(3);
		assertEquals( c.getHungerLevel(), 3 ); 
	}
	
	
	
	
}
