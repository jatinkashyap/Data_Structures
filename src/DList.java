//Sentinel invariants for Circularly Linked list
// For any DList d.head != null
// For any DListNode x x.next and x.prev != null
// if x.next = y so y.prev = x  and x.prev=y and y.prev =x
// Size is always correct (not counting the sentinel)
// In empty Dlist  sentinel prev and next fields point to each other
public class DList {
	private DListNode head;
	private DListNode tail;
	private int size;
	
	public void deleteEnd(){
		//Removes the tail node if atleast there are two nodes in the list
		tail.prev.next = null;
		tail = tail.prev;
	}
	
	public void createSentinel(){
		DListNode sentinel = new DListNode(null,head,tail);
		head.prev = tail.next =  sentinel;
	}
	public static void main(String[] args) {
		
	}
}

class DListNode{
	Object item;
	DListNode prev;
	DListNode next;
	
	DListNode(Object item, DListNode prev, DListNode next){
		this.item = item;
		this.prev = prev;
		this.next = next;
	}
	
}