package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetJavaProgram {

	public static void main(String[] args) {
		
		String str = "I I I Love Love Love India India India";
//		I Love India
		
		String[] arr = str.split(" ");
		
		Set<String> obj = new LinkedHashSet<String>(Arrays.asList(arr));
		
//		System.out.println(obj);
		
//		for(String s : obj) {
//			System.out.print(s+" ");
//		}
		
		Iterator it = obj.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		
		
		
		
		
		

	}

}
