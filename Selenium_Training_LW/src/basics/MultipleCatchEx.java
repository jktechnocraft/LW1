package basics;

public class MultipleCatchEx {

	public static void main(String[] args) {
		try{
			int a = Integer.parseInt(args[0]);
			System.out.println(3/0);
		}
		catch (ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
		catch (ArithmeticException e){
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Hello");
	}
}
