package basics;

public class StringBufferExample {

	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer("Java program");
		
//		System.out.println(obj.append("program"));
		
//		obj.reverse();
		System.out.println(str.reverse());
//		obj.insert(2, 3);
		System.out.println(str.insert(2, 3));
	}

}
