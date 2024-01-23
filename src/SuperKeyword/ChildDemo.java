package SuperKeyword;

public class ChildDemo extends ParentDemo{
	
	String name = "S.Ghosh";
	
	public ChildDemo() {
		
//		super();
		System.out.println("This is child constructor");
	}
	
	public void getData() {
		
		//Parent Methodd
		super.getData();
		
		//Local Method
		System.out.println("Codeclouds");
	}
	
	public void fullname() {
		
		//To call local variable data
		System.out.println(name);
		
		//To call parent variable data
		System.out.println(super.name);
		
	}


}
