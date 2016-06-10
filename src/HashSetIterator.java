import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetIterator {

	public static void main(String[] args){
		Set<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(3);
		set.add(9);
		set.add(5);
		set.add(46);
		set.add(9);
		set.add(69);
		
		Iterator<Integer> itr = set.iterator(); 
				
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}		
	}
	
}
