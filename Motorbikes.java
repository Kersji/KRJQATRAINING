package com.qa.garage;

public class Motorbikes extends Vehicle {
	
	// Variables
	private boolean handlebars;

	// Constructor
	public Motorbikes() {
		super();
	}

	public Motorbikes(boolean handlebars, String colour, int wheels) {
		super(colour, wheels);
		this.handlebars = handlebars;
	}

	// Getters
	public boolean isHandlebars() {
		return handlebars;
	}

	// Setters
	public void setHandlebars(boolean handlebars) {
		this.handlebars = handlebars;
	}

	@Override
	public String toString() {
		return "Motorbikes [handlebars=" + handlebars + ", " + super.toString() + "]";
	}
	
}
