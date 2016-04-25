package com.codeclan.ps;

public abstract class Animal {
	
	protected String type;
	protected int value;
	protected int hunger;
	
	protected Animal () {

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public int getHungerLevel() {
		return hunger;
	}
	
	public void feed(int amount) {
		
		if ( hunger + amount > 10 ) {
			hunger = 10;	
		} else {
			hunger = amount + hunger;
		}
		
	}
	
	
	
	
}
