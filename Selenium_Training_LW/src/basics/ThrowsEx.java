package basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsEx {
	
	public void print() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("C://folder//sample.txt");
	}

	public static void main(String[] args) throws FileNotFoundException{
		
		ThrowsEx obj = new ThrowsEx();
		obj.print();
	}
}
