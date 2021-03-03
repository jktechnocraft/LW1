package basics;

public class SwitchExample {
	
	public void printMonthName(int monthNumber) {
		
		switch(monthNumber) {
		case 1 : System.out.println("January");
		break;
		
		case 2 : System.out.println("February");
		break;
					
		case 3 : System.out.println("March");
		break;
		
		default : System.out.println("Invalid month number");
		break;
		}	
	}
	
	public static void main(String[] args) {
		
		SwitchExample switchExampleObj = new SwitchExample();
		switchExampleObj.printMonthName(2);
	}
}
