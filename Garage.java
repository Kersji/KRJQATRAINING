package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	// Array list to store the vehicles
	private List<Vehicle> vehicles = new ArrayList<>();

	// Constructor
	public Garage() {
		super();
	}

	public void vehicleLoop() {

		int bill = 0;

		for (Vehicle count : this.vehicles) {

			if (count.getClass().getSimpleName().equals("Car")) {
				bill += 200;

			} else if (count.getClass().getSimpleName().equals("Motorbikes")) {
				bill += 100;

			} else if (count.getClass().getSimpleName().equals("Lorry")) {
				bill += 1000;
			}
		}
		System.out.println("Bill: £" + bill);
	}

//	public void addVehicle(Vehicle type, List<Vehicle> vehicles) {
//		vehicles.add(type);
//	}

	public void addVehicle(Vehicle a) {
		this.vehicles.add(a);
	}

	public void removeVehicle(Vehicle b) {
		this.vehicles.remove(b);
	}

	public void emptyGarage() {
		this.vehicles.clear();
		System.out.println("Garage is empty");
	}

	public void removeById(int id) {
		this.vehicles.remove(id);
	}

	public void removeByType(String type) {

		for (Vehicle count : vehicles) {
			if (count.getClass().getSimpleName().equals(type)) {
				this.vehicles.remove(count);
			}
		}
	}

	public void fixById(int id) {

		int bill = 0;

		if (this.vehicles.get(id).getClass().getSimpleName().equals("Car")) {
			bill += 200;

		} else if (this.vehicles.get(id).getClass().getSimpleName().equals("Motorbikes")) {
			bill += 100;

		} else if (this.vehicles.get(id).getClass().getSimpleName().equals("Lorry")) {
			bill += 1000;
		}

		System.out.println("Bill: £" + bill);
	}

	public void print() {
		System.out.println(this.vehicles);
	}

	public void printByColour(String colour) {

		for (Vehicle count : vehicles) {
			if (count.getColour().equals(colour)) {
				System.out.println(count.toString());
			}
		}
	}

}
