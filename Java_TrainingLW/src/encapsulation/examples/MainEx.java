package encapsulation.examples;

public class MainEx {

	public static void main(String[] args) {
		facebookEx obj = new facebookEx();		
		obj.setAge(18);
		obj.setColleageName("Abc college");
		int myAge = obj.getAge();
		String myClgName = obj.getColleageName();		
		System.out.println(myAge);
		System.out.println(myClgName);
	}
}
