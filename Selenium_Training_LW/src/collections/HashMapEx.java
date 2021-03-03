package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		
		Map<Integer, String> obj = new HashMap<Integer, String>();
		obj.put(1, "Rohit");
		obj.put(2, "Virat");
		obj.put(3, "Dhawan");
		obj.put(4, "Yuvraj");
		obj.put(5, null);
		
		System.out.println(obj);
		
		System.out.println(obj.get(2));

	}

}
