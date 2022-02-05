package com.ion.training.oops.coupling.z_exercise;

//---------------------------------------
//--- STEP 00 - WHAT IS LOOSE COUPLING? 
//---------------------------------------

///**
// * Loose Coupling = Low dependencies between “artifacts” (classes, modules, components).
// * 
// * Avoid tight-coupling for collaboration between two classes (if one class wants to call the logic of a second class, then they first class needs an
// * object of second class it means the first class creates an object of second class).
// * 
// * Strive for loosely coupled design between objects that interact.
// * 
// * Inversion Of Control (IoC) / Dependency Injection (DI) - With DI objects are given their dependencies at creation time by some third party (i.e.
// * Java EE CDI, Spring DI…) that coordinates each object in the system. Objects aren’t expected to create or obtain their dependencies—dependencies
// * are injected into the objects that need them. The key benefit of DI—loose coupling.
// */

//---------------------------------------
//--- STEP 01 - UNDERSTAND LOOSE COUPLING BY EXAMPLE
//---------------------------------------

/**
 * Test class for loose coupling example - Traveler is example of tight coupling and GoodTraveler is example of loose coupling
 * 
 *
 * 
 */
public class LooseCouplingTraveler {

	public static void main(String[] args) {
		// Example of loose coupling - To change journey from Car to Bike, it is possible without changing GoodTraveler class
		GoodTraveler gt = new GoodTraveler();
		gt.setV(new Car()); // Inject Car dependency
		gt.startJourney(); // start journey by Car
		gt.setV(new Bike()); // Inject Bike dependency
		gt.startJourney(); // Start journey by Bike
	}
}


/**
 * This is example of loose coupling. In this class, it is not tightly coupled with Car or Bike implementation. Instead by applying dependency
 * injection mechanism, the loose coupling implementation is achieved to allow start journey with any class which has implemented Vehicle interface.
 * 
 *
 * 
 */
class GoodTraveler {
	private Vehicle v;

	public Vehicle getV() {
		return v;
	}

	public void setV(Vehicle v) {
		this.v = v;
	}

	public void startJourney() {
		v.move();
	}
}

/**
 * Vehicle interface to allow loose coupling implementation
 * 
 *
 * 
 */
interface Vehicle {
	public void move();
}

/**
 * Car implements Vehicle interface
 * 
 *
 * 
 */
class Car implements Vehicle {
	@Override
	public void move() {
		System.out.println("Car is moving");
	}
}

/**
 * Bike implements Vehicle interface
 * 
 *
 * 
 */
class Bike implements Vehicle {
	@Override
	public void move() {
		System.out.println("Bike is moving");
	}
}