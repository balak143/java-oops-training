package com.ion.training.oops.principles;

//---------------------------------------
//--- STEP 00 - WHAT IS POLYMORPHISM? 
//---------------------------------------

///** 
// * Polymorphism = single interface multiple implementations.
// *
// * How Polymorphism is supported in Java? - In terms of interface, inheritance,�method overloading�and�method overriding. 
// * (Method overloading and method overriding�uses concept of Polymorphism in Java where method name remains same in two classes, 
// * but actual method called by�JVM�depends upon object at run time and done by�dynamic binding in Java. In case of overloading method 
// * signature changes while in case of overriding method signature remains same and binding and invocation of method is decided on 
// * runtime based on actual object. This facility allows Java programmer to write very flexibly and maintainable code using�interfaces�
// * without worrying about concrete implementation. One disadvantage of using�Polymorphism in code�is that while reading code you don't 
// * know the actual type which annoys while you are�looking to�find bugs or trying to debug program. But if you do�Java debugging in 
// * IDE�you will definitely be able to see the actual object and the method call and variable associated with it.)
// *
// * Where to use Polymorphism in code? - You should use super type in method argument, variable name and return type of method.
// *
// * Parameteric Polymorphism in Java - Java started to support�parametric polymorphism�with introduction of�Generic in JDK1.5. Collection 
// * classes in JDK 1.5 are written using Generic Type which allows Collections to hold any type of object in run time without any change 
// * in code and this has been achieved by passing actual Type as parameter.�
// */

//---------------------------------------
//--- STEP 01 - UNDERSTAND POLYMORPHISM BY SIMPLE EXAMPLE
//---------------------------------------

/**
 * Coding against interface means, the client code always holds an Interface object which is supplied by a factory.
 * Any instance returned by the factory would be of type Interface which any factory candidate class must have implemented. This way the client program is not worried about implementation
 * and the interface signature determines what all operations can be done. This can be used to change the behavior of a program at run-time.
 * It also helps you to write far better programs from the maintenance point of view.
 * 
 *
 * Programm to interfaces not
 */
public class PaymentTest {

	public static void main(String[] args) {
		// Here the runtime polymorphism fundamental is not applied, as it is of single CashPayment form
		CashPayment c = new CashPayment();
		c.pay();

		// Now the initialization is done using runtime polymorphism and it can have many forms at runtime
		// Single payment "p" instance can be used to pay by cash and credit card
		Payment p = new CashPayment();
		p.pay(); // Pay by cash

		p = new CreditPayment();
		p.pay(); // Pay by creditcard

		Payment payment = PaymentFactory.createPayment(PaymentOptions.CREDIT);
		payment.pay();


	}

}

enum PaymentOptions{
	CREDIT,CASH,DEBIT, NETBANKING;
}

class PaymentFactory {
	static Payment createPayment(PaymentOptions paymentOptions) {
		Payment payment = null;
		switch (paymentOptions) {
			case CASH:
				payment = new CashPayment();
			case DEBIT:
				payment = new DebitPayment();
			case CREDIT:
				payment = new CreditPayment();
			case NETBANKING:
				payment = new Netbanking();
		}
		return payment;
	}
}

/**
 * This represents payment interface
 * 
 *
 * 
 */
interface Payment {
	public void pay();
}

/**
 * Cash IS-A Payment type
 * 
 *
 * 
 */
class CashPayment implements Payment {

	// method overriding
	@Override
	public void pay() {
		System.out.println("This is cash payment");
	}

}

/**
 * Creditcard IS-A Payment type
 * 
 *
 * 
 */
class CreditPayment implements Payment {

	// method overriding
	@Override
	public void pay() {
		System.out.println("This is credit card payment");
	}

}


class DebitPayment implements Payment {

	// method overriding
	@Override
	public void pay() {
		System.out.println("This is debit card payment");
	}

}

class Netbanking implements Payment {

	// method overriding
	@Override
	public void pay() {
		System.out.println("This is debit card payment");
	}

}


