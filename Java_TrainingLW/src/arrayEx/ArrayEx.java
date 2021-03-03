package arrayEx;

public class ArrayEx {

	public static void main(String[] args) {
		int[] numArray = new int[4];
		numArray[0]=2;
		numArray[1]=4;
		numArray[2]=7;
		numArray[3]=9;
		
		for(int i=0; i<numArray.length; i++) {
			System.out.println(numArray[i]);
		}
		
		String[] arr=new String[2];
		arr[0]="abc";
		arr[1]="dfs";
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
//		int numArr[]= {1,3,5,7,9};
//		for(int i=0; i<numArr.length; i++) {
//			System.out.println(numArr[i]);
//		}
	}
}
