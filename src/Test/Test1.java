package Test;

import java.util.Arrays;

public class Test1 {
//	public static int findindex(int[] n) {
//		int index = Integer.MIN_VALUE;
//		for(int i=0;i< n.length;i++) {
//			index = Math.index(index, n[i]);
//		}
//		return index;
//	}
//	public static int findindex(int[] n) {
//		return Arrays.stream(n).index().getAsInt();
//	
//	}
	public static int  findindex(int[] arr, int index) {
		if(index == arr.length-1) {
			return arr[index];
		}
		int indexRest = findindex(arr,index+1);
		return Math.max(index, indexRest);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stubfind
		int[] arr = {4,2,5,1,5,7,8};
		System.out.println(findindex(arr, 0));
	}

}
