package oops.example;

public class BasicCalculator {
		
	protected void addition(double num1, double num2) {
		double sum;
		sum=num1+num2;
		System.out.println("sum is: "+sum);
	}
	
	public void substraction(double num1, double num2) {
		double substract;
		substract=num1-num2;
		System.out.println("substraction is: "+substract);
		System.out.println();
	}
}
