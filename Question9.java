package assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

public class Question9 {
	public static void main(String[] args) {
		List<String> tr = new ArrayList();
		tr.add("balaji");
		tr.add("pavan");
		tr.add("poorna");
		tr.add("srikanth");
		tr.add("ajay");
		tr.add("vishnu");
		// only forward traversing is possible here.
		Iterator<String> itr = tr.iterator();
		System.out.println("using iterator: ");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("********************");

		// using listiterator we can traverse in both directions
		System.out.println("using list iterator : ");
		ListIterator<String> li = tr.listIterator(tr.size());
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}

	}

}
