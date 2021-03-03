package basics;

public class Calculator {
	
	int a;  //instance variable
	
	static String name;  //static variable
	
	Boolean x;   // true/false
	char xyz = 'c';
	float number =100.0f;
	
	String name1 = "John";
	
	
	public static void print() {
		
		int b;   //local variable
		
		
	}
	
	public void print1() {
		
	}
	
	 static public void main(String[] args) {

		System.out.println("Hello world");
		
		Calculator obj1 = new Calculator();
		obj1.a=10;
		print();
		obj1.print1();
		
		Calculator obj2 = new Calculator();
		obj2.a=12;
		
		Calculator obj3 = new Calculator();
		obj3.a=15;	
	}
}
