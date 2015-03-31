public class DecimalToBinary {
	public static int [] convert(int n){
		int b[] = new int[25];
		int i=0;
		while(n>0){
			b[i++]= n%2;
			n=n/2;
		};
		return b;
	}
}
