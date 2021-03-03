package basics;

public class PyramidExample {

	public static void main(String[] args) {
		for(int i=1; i<=8; i++)   //rows
		{
			if(i%2==0) {
				continue;  
			}
			
			for(int j=8; j>=i; j--)
			{
				System.out.print(" ");   //printing space
			}
			
			for(int k=1; k<=i; k++) //actual * print
			{
				System.out.print("*");
			}
			System.out.println();  //navigate to next line	
		}
	}

}

