
public class InstanceVariables {
	
	//Instance Variables
	String name;
	String address;
	
	//Class Variables
	static String state = "West Bengal";
	static int i = 0;
	
	static {
		
		
	}
	
	InstanceVariables(String name, String address){
		
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
		
	}
	
	public void getData() {
		
		System.out.println(address + " " + state);
	}
	
	public static void testdata() {
		
		System.out.println("abc");
	}

	public static void main(String[] args) {
		
		
		InstanceVariables ins = new InstanceVariables("Soumyadeep", "Kolkata");
		InstanceVariables ins1 = new InstanceVariables("Sweety", "Bauria");
		ins.getData();
		ins1.getData();
		InstanceVariables.testdata();
		System.out.println(InstanceVariables.i = 44); 

	}

}
