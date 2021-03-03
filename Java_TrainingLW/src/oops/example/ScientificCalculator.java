package oops.example;

public class ScientificCalculator extends BasicCalculator{

	public void calculateSinValue(double sinvalue) {
		double sin;
		sin = Math.sin(sinvalue);
		System.out.println("Sine value is: "+sin);
	}

	public void calculateCosValue(double cosValue) {
		double cos;
		cos = Math.cos(cosValue);
		System.out.println("Cos value is: "+cos);
	}
	
	
}
