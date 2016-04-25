package com.codeclan.ps;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFarm {
	
	@Test
	public void TestFarmHasName() {
		Farm f = new Farm("Globotek");
		assertEquals(f.getName(), "Globotek");
	}
	
	@Test 
	public void TestAddNewAnimalToFarm() {
		Farm f = new Farm("Globotek");
		Cow c = new Cow();
		f.addToFarmAnimals(c);
		assertEquals( f.countFarmAnimals(), 1 );
	}
	
	@Test 
	public void TestGetValueOfFarmAnimals() {
		Farm f = new Farm("FarmTech");
		Cow c = new Cow();
		Sheep s = new Sheep();
		f.addToFarmAnimals(c);
		f.addToFarmAnimals(s);
		assertEquals( f.getValueOfFarmAnimals(), 30);
	}
	
	@Test 
	public void TestSellSheep() {
		Farm f = new Farm("Peter");
		Cow c = new Cow();
		Sheep s = new Sheep();
		f.addToFarmAnimals(c);
		f.addToFarmAnimals(s);
		f.sellSheep();
		assertEquals( f.countFarmAnimals(), 1 );
	}
	
	@Test 
	public void TestAddsMoneyWhenSelling () {
		Farm f = new Farm("Peter");
		Cow c = new Cow();
		Sheep s = new Sheep();
		f.addToFarmAnimals(c);
		f.addToFarmAnimals(s);
		f.sellSheep();
		assertEquals( f.howMuchDollar() , 10 );
	}
	
	@Test 
	public void TestSellFails () {
		Farm f = new Farm("Peter");
		Cow c = new Cow();
		f.addToFarmAnimals(c);
		boolean hasSold = f.sellSheep();
		assertFalse( hasSold );
	}

}
