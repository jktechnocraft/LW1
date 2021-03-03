package basics;

public class StaticDemo {
	static int x=1;
	int y=1;
	
	public StaticDemo() {
		x++;
		y++;
		
		System.out.println("x value is: "+x);
		System.out.println("y value is: "+y);
	}
	
	public void print() {
		System.out.println("hello");
		x++;
	}
	
	public static void print1() {
		System.out.println("Hi");
	}
	
	public static void main(String[] args) {
		StaticDemo s1 = new StaticDemo();
		StaticDemo s2 = new StaticDemo();
		StaticDemo s3 = new StaticDemo();
		
		s1.print();
		print1();		
	}
}
