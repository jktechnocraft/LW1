package basics;

public class StringExample {

	public static void main(String[] args) {
		
		String name = "Java program";
		String name2 = "java program";
		String name3 = " Selenium   ";
		
		System.out.println(name.charAt(2));
		name.compareTo(name2);
		System.out.println(name.compareTo(name2));
		
		name.equalsIgnoreCase(name2);
		System.out.println(name.equalsIgnoreCase(name2));	 //true
		System.out.println(name.equals(name2));   //false
		
		System.out.println(name.indexOf('p'));
		
		System.out.println("length is "+name.length());
		
		name.concat(name3);
		System.out.println(name.concat(name3));
		
		name.substring(2);
		System.out.println(name.substring(2));
		
		name.subSequence(2, 7);
		System.out.println(name.subSequence(2, 7));
		
		name2.replace("java", "Python");
		System.out.println(name2.replace("java", "Python"));
		
		name3.trim();
		System.out.println(name3);
		System.out.println(name3.trim());
		
		
		
		
		
		
		
		
		
		
		

	}

}
