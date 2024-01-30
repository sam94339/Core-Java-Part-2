import java.util.HashSet;


public class Hashset {

	public static void main(String[] args) {
		
		HashSet<String> hash = new HashSet<String>();
		
		hash.add("USA");
		hash.add("UK");
		hash.add("Canada");
		hash.add("India");
		
		System.out.println(hash);
		
//		hash.remove("USA");
		
		System.out.println(hash);
		System.out.println(hash.isEmpty());
		System.out.println(hash.size());
		

	}

}
