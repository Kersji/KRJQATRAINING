package com.qa.garage;

// abstract because we can't create an object
// such as vehicle
public abstract class Vehicle {

	// Variables
	private String colour;
	private int wheels;

	// Constructor

	// Allows to create a vehicle such as Car
	// without attributes
	public Vehicle() {
		super();
	}

	// Allows to create a vehicle such as Car
	// with attributes
	public Vehicle(String colour, int wheels) {
		super();
		this.colour = colour;
		this.wheels = wheels;
	}

	// Getters
	public String getColour() {
		return colour;
	}

	public int getWheels() {
		return wheels;
	}

	// Setters
	public void setColour(String colour) {
		this.colour = colour;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	// Allows to print the attributes of a
	// vehicle
	@Override
	public String toString() {
		return "Vehicle [colour=" + colour +
				", wheels=" + wheels + "]";
	}
	
}
