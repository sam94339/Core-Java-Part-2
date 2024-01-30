import java.util.HashSet;
import java.util.Iterator;

public class Iterators {

	public static void main(String[] args) {
		
		HashSet<String> hash = new HashSet<String>();
		
		hash.add("USA");
		hash.add("UK");
		hash.add("Canada");
		hash.add("India");
		
		Iterator<String> it = hash.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}

	}

}
