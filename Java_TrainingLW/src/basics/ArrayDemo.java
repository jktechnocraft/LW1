package basics;

public class ArrayDemo {
	
	int[] numbers;
	
	public void storeNumbers() 
	{
		numbers = new int[101];	
		for(int i=0; i<numbers.length; i++) {
			numbers[i]=i;
		}	
	}
	
	public void printEvenNumber() 
	{
		for(int i=0; i<numbers.length; i++)
		{
			if(i%2==0)       //if even value is present
			{         
				System.out.println(numbers[i]);
			}
		}	
	}
	

	public static void main(String[] args) {
		
		ArrayDemo arrayDemoObj = new ArrayDemo();
		
		arrayDemoObj.storeNumbers();
		arrayDemoObj.printEvenNumber();
		
		
		
		

	}

}
