
public class TryCatch {

	public static void main(String[] args) {
		
		int a = 4;
		int b = 0;
		
		
		
		try {
			
			int k = a/b;
			System.out.println(k);
			
		}
		
		catch(ArithmeticException em) {
			
			System.out.println("This is Arithmetic exception");
		}
		
		catch(Exception e) {
			
			System.out.println("This is exception");
		}
		
		finally {
			
			System.out.println("This is finally blog");
		}

	}

}
