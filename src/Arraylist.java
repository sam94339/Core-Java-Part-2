import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add(".Net");
			
		System.out.println(list.get(0));
		
		list.add(1, "Python");
		
		System.out.println(list);
		
//		list.remove(0);
		
		System.out.println(list.contains("Java"));
		
		
		

	}

}
