package interfaceex;

public class MainEx {

	public static void main(String[] args) {
		Car obj = new Car();
		obj.accelerate();
		obj.applyBreak();
		
		IVehical obj1 = new Bus();
		obj1.accelerate();
		obj1.applyBreak();
	}

}
