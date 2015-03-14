
public class List {
	int a[];
	int lastItem;
	
	List(){
		a = new int[10];
		lastItem=-1;
	}
	
	public void insertItem(int newItem, int location){
		if(lastItem +1 == a.length){
			int b[] = new int[2*a.length];
			for(int i=0;i<a.length;i++){
				b[i]=a[i];
			}
			a=b;
		}
		
		for(int i=lastItem;i>=location;i--){
			a[i+1]=a[i];
		}
		a[location]=newItem;
		lastItem++;
	}
	
	public void displayList(){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"  ");
		}
	}
	
	public static void main(String[] args) {
		List l1 = new List();
		l1.insertItem(3, 0);
		l1.displayList();
	}
}
