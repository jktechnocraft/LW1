package basics;

public class Calculator {
	
	public Calculator() {    //default constructor
		
	}
	
	int num1=50;    //instance variable
	
	public void addition() {       //Method definition
		int num2=100;    //local variable
		int sum;
		sum=num1+num2;
		System.out.println(sum);	
	}
	
	public void substraction(int a, int b) {
		int sub;
		sub = a-b;
		System.out.println(sub);
	}
	
	public int multiplication(int x, int y) {
		int total;
		total = x*y;
		return total;
	}
	
	public static void main(String[] args) {
		Calculator calculatorObj = new Calculator();
		calculatorObj.addition();  //method calling or method invocation
		calculatorObj.substraction(70, 30);
		int total1 = calculatorObj.multiplication(10, 20);
		System.out.println(total1);
	}

}


