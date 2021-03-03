package controltatements;

public class SwitchCaseEx {

	public static void main(String[] args) {
		int monthNum=3;
		switch(monthNum) 
		{
		case 1 :
			System.out.println("January");
			break;
		case 2 :
			System.out.println("Feb");
			break;
		case 3 :
			System.out.println("March");
			break;
		case 4 :
			System.out.println("Apr");
			break;
		case 5 :
			System.out.println("May");
			break;
		default:
			System.out.println("No month");
			break;
		}		
	}
}
