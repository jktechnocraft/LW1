package basics;

public class NumberCheck {
	
	public void displayBigNumber(int num1, int num2, int num3) {
		int bigNumber=0;
		
		if(num1>num2) {
			if(num1>num3) {
				bigNumber=num1;
			}
		}
		System.out.println("big number is: "+bigNumber);
	}

	public static void main(String[] args) {
		NumberCheck numberCheck = new NumberCheck();
		numberCheck.displayBigNumber(5, 20, 30);
	}

}
