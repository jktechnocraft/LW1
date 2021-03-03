package polymorhism.examples;

public class MethodOverrideEx extends MethodOverLoadingEx{

	public void print(String message) {		
		System.out.println(message + " Java");
	}
		
	public static void main(String[] args) {
		MethodOverrideEx obj = new MethodOverrideEx();
		obj.print("Hello");
		MethodOverLoadingEx obj1 = new MethodOverLoadingEx();
		obj1.print("Hi");	
	}

}
