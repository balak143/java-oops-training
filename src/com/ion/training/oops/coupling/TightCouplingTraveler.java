package com.ion.training.oops.coupling;

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
//--- STEP 01 - UNDERSTAND TIGHT COUPLING BY EXAMPLE
//---------------------------------------

/**
 * This is example of tight coupling. Here to start journey, the Traveler class is creating Car object to interact with it using move() method.
 * Hence both are tightly coupled. Now if there is a need to change journey from Car to Bike, then it requires to do changes in Traveler class
 * (i.e. replace Car object with Bike object). Hence tight coupling should be avoided.
 *
 *
 */
class Traveler {
    Vehicle vehicle = null;
    Traveler(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    public void startJourney() {
        vehicle.move();
    }
}


interface Vehicle{
    void move();
}
class Car implements Vehicle{
    public void move() {
        System.out.println("Car is moving");
    }
}

class Bike implements Vehicle{
    public void move() {
        System.out.println("Bike is moving");
    }
}

class Bicycle implements Vehicle{
    public void move() {
        System.out.println("Bike is moving");
    }
}



public class TightCouplingTraveler {
    public static void main(String[] args) {
        // Example of tight coupling - To change journey from Car to Bike, it requires changes in BadTraveler class
       Vehicle vehicle = new Car();
        Traveler bt = new Traveler(vehicle);
        bt.startJourney();

        vehicle = new Bike();
        bt = new Traveler(vehicle);
        bt.startJourney();

    }
}