package com.qa.garage;

public class Car extends Vehicle {

	// Variables
	private boolean windscreen;

	// Constructor
	public Car() {
		super();
	}

	public Car(boolean windscreen, String colour, int wheels) {
		super(colour, wheels);
		this.windscreen = windscreen;
	}

	// Getters
	public boolean isWindscreen() {
		return windscreen;
	}

	// Setters
	public void setWindscreen(boolean windscreen) {
		this.windscreen = windscreen;
	}

	// Allows to print the attributes of a vehicle -
	// super.toString()
	// including additional attributes of a car -
	// windscreen

	@Override
	public String toString() {
		return "Car [windscreen=" + windscreen + ", " + super.toString() + "]";
	}
}
