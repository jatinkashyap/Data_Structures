interface Base{
	public void killList();
}
class Demo implements Base,Comparable{
	
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void killList() {
		// TODO Auto-generated method stub
		
	}
	
	public void doNothing(){
		System.out.println("Doing nothing Demo");
	}
	
	public static void main(String[] args) {
		Base b = new Demo();
		Comparable c = (Comparable) b;
	}
}