package set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet h = new LinkedHashSet();
		h.add("B");
		h.add("C");
		h.add("Z");
		h.add(10);
		h.add(null);
		h.add(null);
		System.out.println(h.add("Z"));
		System.out.println(h);	
	}
}
