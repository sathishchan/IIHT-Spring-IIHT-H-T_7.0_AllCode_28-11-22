package com.basics.interfaces;

//Using the interface by third user
public class Vechicle {

	public static void main(String[] args) {
		Drivable d1 = new Car();
		Drivable d2 = new Bike();
		Drivable d3 = new Truck();
		d1.driven();
		d2.driven();
		d3.driven();

	}

}

//implement done by second user
class Car implements Drivable {
	public void driven() {
		System.out.println("The Car can be driven");
	}
}

class Bike implements Drivable {
	public void driven() {
		System.out.println("The Bike can be driven");
	}
}

class Truck implements Drivable {
	public void driven() {
		System.out.println("The Truck can be driven");
	}
}