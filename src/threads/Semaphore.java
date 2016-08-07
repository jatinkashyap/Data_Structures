package threads;

public class Semaphore {
	private int count;
	public Semaphore(int n){
		this.count = n;
	}
	public synchronized void acquire(){
		while(count <=0){
			try{
				wait();
			}catch(InterruptedException e){
				
			}
			count--;
		}
	}
	public synchronized void release(){
		count++;
		notify();
	}
}
