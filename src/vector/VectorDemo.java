package vector;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector v1= new Vector();
		Vector v2 = new Vector(1000);
		Vector v3 = new Vector(1000,5);
		System.out.println(v1.capacity());
		for(int i=0;i<10;i++){
			v1.addElement(i);
		}
		v1.addElement("A");
		System.out.println(v1.capacity());
		System.out.println(v1);
	}
}
