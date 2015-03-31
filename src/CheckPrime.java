
public class CheckPrime {
	public static void check(int n){
		boolean prime = true;
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				prime=false;
				break;
			}
		}
		if(prime){
			System.out.println("prime");
		}else{
			System.out.println("Not prime");
		}
	}
	public static void main(String[] args) {
		check(33);
	}
}
