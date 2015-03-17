package set;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add("B");
		h.add("C");
		h.add("Z");
		h.add(10);
		h.add(null);
		System.out.println(h.add("Z"));
		System.out.println(h);
	}
}
