package basics;

public class StringExample {

	public static void main(String[] args) {
		
		String name="John";
		
		System.out.println(name.length());
	
		String name1= "johns";
		
		System.out.println(name.equalsIgnoreCase(name1));
		
		System.out.println(name.concat(name1));
		System.out.println(name.replace('h', 'i'));
		
		StaticDemo.print1();
	}
}
