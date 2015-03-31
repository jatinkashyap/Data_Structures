
public class BinaryToDecimal {
	public static int convert(int b){
		int n=0;
		int i=0;
		while(b>0){
			n += Math.pow(2, i)*(b%10);
			b=b/10;
			i++;
		}
		return n;
	}
	public static void main(String[] args) {
		System.out.println(convert(111));
	}
}
