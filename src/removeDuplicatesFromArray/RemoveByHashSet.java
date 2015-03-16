package removeDuplicatesFromArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveByHashSet {
	public static int[] remove(int array[]){
		HashSet<Integer> hs = new HashSet<Integer>();
		int newArray[] = new int[array.length];
		int i=0;
		for(int element:array){
			if(hs.add(element)){
				newArray[i++]=element;
			}
		}
		return Arrays.copyOf(newArray, i);
	}
	
	public static void main(String[] args) {
		
		int array[] = {23,45,45,12,12,98};
		int []newArray = remove(array);
		for(int i:newArray){
			System.out.print(i+"  ");
		}
	}
}
