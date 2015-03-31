
public class SingletonDemo {
	private static SingletonDemo s;
	static{
		s = new SingletonDemo();
	}
	private SingletonDemo(){}
	public static SingletonDemo getInstance(){
		return s;
	}
	public void test(){
		System.out.println("Working");
	}
	public static void main(String[] args) {
		SingletonDemo s1 = SingletonDemo.getInstance();
		s1.test();
	}
}
