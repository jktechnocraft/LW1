package controltatements;

public class IfElseEx {

	public static void main(String[] args) {

		int num1 = 20;
		int num2 = 10;
		int num3 = 25;

		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println("num1 is greater");
			} else if (num2 > num1) {
				if (num2 > num3) {
					System.out.println("num2 is greater");
				}
			} else {
				System.out.println("num3 is greater");
			}
		}
	}
}
