
public class DeadlockDemo {
	String s1 = "JAVA";
	String s2 = "UNIX";
	
	Thread t1 = new Thread("My Thread 1"){
		public void run(){
			while(true){
				synchronized(s1){
					synchronized(s2){
						System.out.println(s1+" "+s2);
					}
				}
			}
		}
	};
	
	Thread t2 = new Thread("My Thread t2"){
		public void run(){
			while(true){
				synchronized(s2){
					synchronized(s1){
						System.out.println(s2+" "+s1);
					}
				}
			}
		}
	};
	
	public static void main(String[] args) {
		DeadlockDemo d1 = new DeadlockDemo();
		d1.t1.start();
	}
}
