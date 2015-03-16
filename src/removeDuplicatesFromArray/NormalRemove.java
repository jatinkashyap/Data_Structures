package removeDuplicatesFromArray;

public class NormalRemove {
	public static void main(String[] args) {
		int a[] = {23,45,45,12,12,98};
		int length = a.length;
		for(int i=0;i<length-1;i++){
			if(a[i]==a[i+1]){
				int shift = a[i+1];
				for(int k=i+2;k<length;k++){
					a[k-1]=a[k];
				}
				a[length-1]=shift;
				length--;
			}
		}
		for(int i=0;i<length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
