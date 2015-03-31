
public class FibonacciSeries {
	public static void main(String[] args) {
		
		int fib[] = new int[15];
		fib[0]=0;
		fib[1]=1;
		for(int n=2;n<15;n++){
			fib[n]=fib[n-1]+fib[n-2];
		}
		for(int i:fib){
			System.out.print(i+" ");
		}
	}
}
