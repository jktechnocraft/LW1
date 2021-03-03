package basics;

public class MainEx {

	public static void main(String[] args) {
		Facebook fb = new Facebook();
		fb.setAge(30);
		fb.setId(1234);
		
		int age = fb.getAge();
		System.out.println(age);
		
		System.out.println(fb.getId());	
	}

}
