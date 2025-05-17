package Core;

import java.util.Arrays;

public class selectionSort {
    public static void selectionSort(int[] arr) {
    	int n = arr.length;
    	for(int i=0;i<n-1;i++) {
    		int minIndex =i;
    		for(int j=i+1;j<n;j++) {
    			if(arr[j] < arr[minIndex]) {
    				minIndex = j;
    			}
    		}
    		int temp = arr[minIndex];
    		arr[minIndex] = arr[i];
    		arr[i]= temp;
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {64, 25, 12, 22, 11};

        System.out.println("Before sorting: " + Arrays.toString(numbers));
        selectionSort(numbers);
        System.out.println("After sorting: " + Arrays.toString(numbers));
	}

}
