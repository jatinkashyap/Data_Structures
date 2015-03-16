package cursorsCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		for(int i=0;i<10;i++){
			a.add(i);
		}
		System.out.println(a);
		Iterator itr = a.iterator();
		while(itr.hasNext()){
			Integer I = (Integer)itr.next();
			if(I%2==0){
				System.out.print(I+" ");
			}else{
				itr.remove();
			}
		}
		System.out.println(a);
	}
}
