package oops.example;

public class Car {
	
	protected int speed; //state
	
	protected void accelerate() {     //concrete method
		System.out.println("speed is 150");
	}
	
	public static void main(String[] args) {
		Car hondaCar = new Car();
		hondaCar.accelerate();
	}
}

//Inheritance
//Polymorphism
//Abstraction
//Encapsulation