
public class Constructor {
	
	//Default Constructor
	public Constructor() {
		
		System.out.println("Soumyadeep Ghosh");
	}
	
	//Parametarize constructor
	
	public Constructor(int a, int b) {
		
		System.out.println(a+b);
		
	}

	public static void main(String[] args) {
		
		Constructor con = new Constructor();
		Constructor c = new Constructor(10, 30);

	}

}
