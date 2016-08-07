package exceptions;

public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println(normal());
	}
	public static int normal(){
		try{
			try{
				int i = 10/0;
			}catch(ArrayIndexOutOfBoundsException ae){
				System.out.println(ae.getMessage());
				return 0;
			}
			finally{
				System.out.println("hii");
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return 0;
	}
}
