// An abstract data type
// Invariant 1 :Size field is always correct
// Invariant 2 : A list is never circularly linked.
class SList{
	private SListNode head;
	int size; // number of entries in the list
	
	public SList(){
		head=null;
		size=0;
	}
	
	public void insertFront(int item){
		head = new SListNode(item,head);
		size++;
	}
	
	public void deleteFront(){
		if(head != null){
			head = head.next;
			size--;
		}
	}
}