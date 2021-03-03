package interfaceex;

public class Car implements IVehical{

	@Override
	public void applyBreak() {
		
		System.out.println("car break");
	}

	@Override
	public void accelerate() {
		
		System.out.println("acclerate car");
	}

}
