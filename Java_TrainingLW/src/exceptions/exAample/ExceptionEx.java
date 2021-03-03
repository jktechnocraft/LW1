package exceptions.exAample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionEx {

	public static void main(String[] args) {
		try {
			int num=5/0;
			System.out.println(num);
		} 
		catch (ArithmeticException e) {
			e.printStackTrace();
		}	
		finally{
			System.out.println("Hello");
		}
		
	}

}
