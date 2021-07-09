package com.qa.garage;

public class Lorry extends Vehicle {

	// Variables
	private boolean cab;

	// Constructor
	public Lorry() {
		super();
	}

	public Lorry(boolean cab, String colour, int wheels) {
		super(colour, wheels);
		this.cab = cab;
	}

	// Getter
	public boolean isCab() {
		return cab;
	}

	// Setter
	public void setCab(boolean cab) {
		this.cab = cab;
	}

	@Override
	public String toString() {
		return "Lorry [cab=" + cab + ", " + super.toString() + "]";
	}
	
}
