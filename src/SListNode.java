//Linked List is a recursive data type
//Advantages
public class SListNode {
	int item;
	SListNode next;
	
	public SListNode(int item, SListNode next){
		this.item = item;
		this.next = next;
	}
	
	public void insertAfter(int item){
		next = new SListNode(item,next);
	}
	
	public SListNode nth(int position){
		if(position == 1){
			return this;
		}else if (position == -1 || next==null){ // here next=null means the case where 
			//finding the nth item is greater than the length of list and we are at last element where next is null 
			return null;
		}else{
			return next.nth(position -1);
		}
	}
	
	public static void main(String[] args) {
		SListNode l3 = new SListNode(5,null);
		SListNode l2 = new SListNode(0,l3);
		SListNode l1 = new SListNode(7,l2);
		l2.insertAfter(2);
		System.out.println(l1.nth(3).item);
	}
}
