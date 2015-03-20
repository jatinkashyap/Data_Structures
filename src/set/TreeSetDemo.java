package set;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet t= new TreeSet();
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("Z");
		t.add("L");
		//t.add(1); Class Cast Exception will be thrown
		//t.add(null); Null Pointer Exception 
		System.out.println(t);
	}
}
