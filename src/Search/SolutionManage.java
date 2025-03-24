package Search;

import java.util.Arrays;

public class SolutionManage {
	public static void insertionSort(int arr[]) {
		int n = arr.length;
		for(int i=0; i < n;i++) {
			int key = arr[i];
			int j=i-1;
		
		
		while(j >=0 && arr[j] > key ) {
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1] = key;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4, 1, 3, 9, 7};
        insertionSort(arr);

		System.out.println(Arrays.toString(arr));
	}

}
