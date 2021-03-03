package basics;

public class ArrayExample {

	public static void main(String[] args) {
		
		int[] numbers = new int[5];  //one D array   //declaration
		
		numbers[0]=3;  //assign
		numbers[1]=5;
		numbers[2]=7;
		numbers[3]=8;
		numbers[4]=9;
		
		System.out.println(numbers[0]);
		
		int num=5;
		boolean b=true;
		
		String str = "John";
		
		System.out.println(num);
		
		int[] numbers1 = {3,5,7,8,9};  //2nd approach
		
		System.out.println(numbers1);
		
		//lenght=5
		System.out.println("length is "+numbers1.length);
		
		for(int i=0; i<numbers.length; i++)
		{
			System.out.println(numbers[i]);
		}
		
		
		int[][] numbers11;   //multi D array
		

	}

}
