package cursorsCollections;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("Bala");
		l.add("Pinki");
		l.add("Chiru");
		l.add("Nag");
		System.out.println(l);
		ListIterator ltr = l.listIterator();
		while(ltr.hasNext()){
			String s = (String)ltr.next();
			if(s.equals("Pinki")){
				ltr.remove();
			}else if(s.equals("Nag")){
				ltr.add("Chintu");
			}else if(s.equals("Bala")){
				ltr.set("Rajan");
			}
		}
		System.out.println(l);
	}
}
