package com.codeclan.ps;

import java.util.ArrayList;

public class Farm {
	
	ArrayList<Animal> farmAnimals = new ArrayList<Animal>();
	public String name;
	protected int money;
	
	public Farm(String name) {
		this.name = name;
	}
	
	public void addToFarmAnimals(Animal a) {
		this.farmAnimals.add(a);
	}

	public String getName() {
		return this.name;
	}
	
	public int countFarmAnimals() {
		return this.farmAnimals.size();
	}
	
	public int getValueOfFarmAnimals () {
		int valueToReturn = 0;
		for ( int i = 0; i < farmAnimals.size(); i ++ ) {
			valueToReturn = farmAnimals.get(i).getValue() + valueToReturn;
		}
		return valueToReturn;
	}
	
	public boolean sellSheep() {
		for ( int i = 0; i < farmAnimals.size(); i ++ ) {
			if(farmAnimals.get(i).getType() == "Sheep" ) {
				money = farmAnimals.get(i).getValue() + money; 
				farmAnimals.remove(i);
				return true;
			}
		}
		return false;
	}

	public int howMuchDollar() {
		return money;
	}
	

}
