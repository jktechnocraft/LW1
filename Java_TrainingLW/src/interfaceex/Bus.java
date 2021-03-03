package interfaceex;

public class Bus implements IVehical{

	@Override
	public void applyBreak() {
		System.out.println("Bus break");
		
	}

	@Override
	public void accelerate() {
		System.out.println("accelarate bus");
		
	}

}
