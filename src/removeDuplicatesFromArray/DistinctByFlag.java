package removeDuplicatesFromArray;

public class DistinctByFlag {
	public static void main(String[] args) {
		int a[] ={5,2,7,2,4,7,8,2,3};
		printDistinct(a);
	}
	public static void printDistinct(int a[]){
		for(int i=0;i<a.length;i++){
			boolean distinct = true;
			for(int j=0;j<i;j++){
				if(a[i]==a[j]){
					distinct = false;
				}
			}
			if(distinct){
				System.out.print(a[i]+" ");
			}
		}
	}
}
