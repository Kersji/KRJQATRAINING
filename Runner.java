package com.qa.garage;

public class Runner {

	public static void main(String[] args) {

		Car car1 = new Car(true, "Purple", 4);
		Motorbikes bike1 = new Motorbikes(true, "Yellow", 2);
		Motorbikes bike2 = new Motorbikes(false, "Black", 2);
		Lorry lor1 = new Lorry(true, "Blue", 18);
		Garage garage1 = new Garage();

		garage1.addVehicle(car1);
		garage1.addVehicle(bike1);
		garage1.addVehicle(bike2);
		garage1.addVehicle(lor1);
		garage1.print();

		garage1.removeVehicle(bike1);

		garage1.print();

		garage1.vehicleLoop();

		garage1.printByColour("Purple");

		garage1.fixById(1);
		garage1.emptyGarage();
		garage1.print();

	}

}
