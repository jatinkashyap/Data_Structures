package list;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("A");
		l.add(10);
		l.add("A");
		System.out.println(l);
		l.remove(2);
		l.add(2,"M");
		System.out.println(l);
	}
	
}
