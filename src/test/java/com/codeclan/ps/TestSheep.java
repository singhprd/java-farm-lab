package com.codeclan.ps;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSheep {

	@Test 
	public void TestSheepHasType() {
		Sheep s = new Sheep();
		assertEquals(s.getType(), "Sheep");
	}
	
	@Test 
	public void TestSheepHasValue() {
		Sheep s = new Sheep();
		assertEquals(s.getValue(), 10);
	}
	
	@Test 
	public void TestSheepCanFeed() {
		Sheep s = new Sheep();
		s.feed(2);
		assertEquals( s.getHungerLevel(), 2 );
	}
	
	@Test 
	public void TestSheepCantOverfeed( ) {
		Sheep s = new Sheep();
		s.feed(100);
		assertEquals( s.getHungerLevel(), 10 );
	}
	
	
	
	
}
