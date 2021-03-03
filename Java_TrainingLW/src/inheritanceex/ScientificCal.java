package inheritanceex;

public class ScientificCal extends BasicCalculator{

	public void calculateSineVal() {
		super.addition(2, 3);
		double sinval = Math.sin(45);
		System.out.println(sinval);
	}

	public void calculateCosVal() {
		double sinval = Math.cos(45);
	}
	
}
