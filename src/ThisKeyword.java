
public class ThisKeyword {
	
	int a = 10; //Global Variable(Global Variable is declare in class level)
	
	public void getData() {
		
		int a = 20; //Local Variable(Local variable is declare in method level.)
		System.out.println(a); //To call local variable
		System.out.println(this.a); // To call global variable
	}

	public static void main(String[] args) {
		
		ThisKeyword thisk = new ThisKeyword();
		
		thisk.getData();

	}

}
