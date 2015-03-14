
public class Sort {
	public static void main(String[] args) {
		int a[]= {89,34,67,12,98,56,90,45,14};
		mergeSort(a, 0, a.length-1);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"  ");
		}
	}
	
	public static void insertionSort(int a[]){
		for(int i=1;i<a.length;i++){
			int k=a[i];
			int j=i-1;
			while(j>=0 && a[j]<k){
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=k;
		}
	}
	
	public static void insertionSort2(int a[]){
		for(int i=a.length-2;i>=0;i--){
			int k = a[i];
			int j=i+1;
			while(j<a.length && k<a[j]){
				a[j-1]=a[j];
				j++;
			}
			a[j-1]=k;
		}
	}
	
	public static void selectionSort(int a[]){
		for(int i=0;i<a.length-1;i++){
			int min=a[i];
			int loc=i;
			for(int j=i+1;j<a.length;j++){
				if(a[j]<min){
					min=a[j];
					loc=j;
				}
			}
			a[loc]=a[i];
			a[i]=min;
		}
	}
	
	public static void bubbleSort(int a[]){
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[j]<a[i]){
					int k=a[j];
					a[j]=a[i];
					a[i]=k;
				}
			}
		}
	}
	
	public static void mergeSort(int a[],int start, int end){
		if(start<end){
			int mid = (start + end)/2;
			mergeSort(a,start,mid);
			mergeSort(a,mid+1,end);
			merge(a,start,mid,end);
		}
	}
	
	public static void merge(int a[],int start,int mid,int end){
		System.out.println(start+ "  "+ mid+ "  "+end);
		int l[] = new int[mid-start+1];
		int r[] = new int[end-mid];
		for(int i=0;i<l.length;i++){
			l[i]=a[start+i];
		}
		for(int i=0;i<r.length;i++){
			r[i]=a[mid+1+i];
		}
		int s=start;
		int x=0;
		int y=0;
		while(s<=end){
			System.out.println(l[x]+ "  "+ r[y]+ "  "+a[s]);
			if(l[x]<=r[y]){
				a[s]=l[x];
				x++;
			}else{
				a[s]=r[y];
				y++;
			}
			s++;
		}
	}
}
