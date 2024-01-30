import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(0, "Soumya");
		map.put(1, "Deep");
		map.put(2, "Ghosh");
		
		System.out.println(map.get(1));
		map.remove(1);
		System.out.println(map.get(1));
		
		Set set = map.entrySet();
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			
//			System.out.println(it.next());
			Map.Entry mp  = (Map.Entry)it.next();
			System.out.println(mp.getValue());
		}

	}

}
