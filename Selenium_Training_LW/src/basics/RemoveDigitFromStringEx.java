package basics;

public class RemoveDigitFromStringEx {

	public static void main(String[] args) {
		String str = "abc123de4";
		int sum=0;
		for(int i=0; i<str.length(); i++) {
			
			if(Character.isDigit(str.charAt(i))) {
				
//				sum=sum+Integer.parseInt(str.charAt(index));
			}
		}
		
		System.out.println(sum);
	}

}
