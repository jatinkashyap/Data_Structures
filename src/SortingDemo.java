public class SortingDemo {
	public static void bubbleSort(int a[]){
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			print(a);
		}
	}
	public static void insertionSort(int a[]){
		for(int i=1;i<a.length;i++){
			int k = a[i];
			int j=i-1;
			while((j>=0) && (a[j]>k)){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=k;
			print(a);
		}
	}
	public static void print(int a[]){
		for(int i:a){
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int a[] = {23,42,13,36,19,66};
		insertionSort(a);
	}

}
