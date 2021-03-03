package basics;

public class SimpleForExample {

	public static void main(String[] args) {
		
		int[] num = new int[5];
		num[0]=1;
		num[1]=5;
		num[2]=7;
		num[3]=4;
		num[4]=9;
		
		int[] num1={1,3,5,7,9};
		
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		
		for(int i=0; i<num1.length; i++) {
			System.out.println(num1[i]);
		}
		
		
		
	}
}


