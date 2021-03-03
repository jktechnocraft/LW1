package basics;

public class PatternExample {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++)   //rows
		{
			for(int j=1; j<=i; j++) //actual * print
			{
				System.out.print(j+" ");
			}
			System.out.println();  //navigate to next line	
		}
	}
}


//output 
//*
//**
//***
//****
//*****
