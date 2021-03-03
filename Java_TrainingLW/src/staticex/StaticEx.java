package staticex;

public class StaticEx {
	static int x=1;
	int y=1;
	
	public StaticEx() {
		
		x++;
		y++;
		System.out.println("value of x is: "+x);
		System.out.println("value of y is: "+y);	
	}
	public StaticEx(int a) {
		int y=2;
		this.y=a;
		System.out.println(y);
		System.out.println(this.y);
	}
	
	public static void print() {
		
		System.out.println("Hello");
	}
	
	public void print1() {
		
		System.out.println("Hellooo");
	}
	
	public static void main(String[] args) {
		StaticEx obj = new StaticEx();
		StaticEx obj1 = new StaticEx();
		StaticEx obj2 = new StaticEx();
		StaticEx obj3 = new StaticEx();
		StaticEx obj4 = new StaticEx(5);
		
		print();
		obj.print1();
	}
}
