package com.ion.training.oops.polymorphysm;

interface Flyable {
	void fly();

}

class Aeroplane implements Flyable {
	public void fly() {
		System.out.println("Aeroplane is flying");
	}
}

class Bird implements Flyable {
	public void fly() {
		System.out.println("Bird is flying");
	}
}



class Test {

	public static void main(String[] args) {
		Flyable flyable = new Bird();
		fly(flyable);
		flyable = new Aeroplane();
		fly(flyable);
	}

	public static  void fly(Flyable f){
		f.fly();
	}

}