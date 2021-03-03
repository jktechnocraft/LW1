package polymorhism.examples;

public class MethodOverLoadingEx {

	public void print() {
		System.out.println("Hello");
	}
	
	public void print(String message) {
		System.out.println(message);
	}

	public void print(int num) {
		System.out.println(num);
	}

	public static void main(String[] args) {
		MethodOverLoadingEx obj = new MethodOverLoadingEx();
		obj.print();
		obj.print(5);
		obj.print("Hello world");	
	}
}
