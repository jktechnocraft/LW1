package stringEx;

public class StringEx {

	public static void main(String[] args) {
		int j=1;
		char c;
		String name="java program";
		String name1="Java program";
		System.out.println(name.charAt(2));
		
		System.out.println(name.equals(name1));
		System.out.println(name.equalsIgnoreCase(name1));
		
			String[] names=name.split(" ");
			for(int i=0; i<names.length; i++) {
				System.out.println(names[i]);
			}
		
			System.out.println(name.concat(name1));
			System.out.println(name.length());
			System.out.println(name.substring(5));
			System.out.println(name.substring(2,6));
			System.out.println(name.replace("java", "c"));
	}

}
