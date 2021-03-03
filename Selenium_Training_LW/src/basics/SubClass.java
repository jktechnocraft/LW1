package basics;

public class SubClass extends SuperClass {

	@Override
	public void print() {
		System.out.println("sub class method");
	}

	public static void main(String[] args) {
		SubClass obj = new SubClass();  
		obj.print();
		
		SuperClass obj1 = new SuperClass();
		obj1.print();
	}
}
