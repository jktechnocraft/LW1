package basics;

public class ReversePatternExample {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++)   //rows
		{
			for(int j=5; j>=i; j--) //actual * print
			{
				System.out.print("*");
			}
			System.out.println();  //navigate to next line	
		}
		
	}

}

//output
//*****
//****
//***
//**
//*


			
