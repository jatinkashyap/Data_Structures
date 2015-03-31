
public class TopNumbersArray {
	public static void find(int a[]){
		int max=0,smax=0;
		for(int n:a){
			if(n>max){
				smax=max;
				max=n;
			}else if(n>smax){
				smax=n;
			}
		}
	}
	public static void main(String[] args) {
		
	}
}
