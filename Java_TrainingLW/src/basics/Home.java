package basics;

public class Home {
	
	int brick=1000; //------instance variable
	
	public void constructBasement() {    //Actions
		int soil=10;   //local variable
//		mixture = Cement+ soil
//		mixture+rods
		
		

	}
	
	public void constructColumn() {    //Actions
		
//		mixture = Cement+ soil
//		mixture+rods
		int num1=10;
		int num2=10;
		num1=num2;

	}
	
	public static void main(String args[])   //JVM   ....main method
	{
		
		Home homeObj = new Home();
		homeObj.constructBasement();
		
		System.out.print("Home created");
	}
	

}
