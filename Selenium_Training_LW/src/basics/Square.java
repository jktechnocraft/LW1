package basics;

public class Square implements InterfaceEx{
	
	@Override
	public double calculateArea() {
		double length=5;
		double breadth= 10;
		return length*breadth;
	}

	@Override
	public double calculateVolume() {
		
		return 0;
	}

	public static void main(String[] args) {
		Square obj = new Square();
		double area= obj.calculateArea();
		System.out.println("area of square is "+area);
	}

	

}
