package CodeFores;

import java.util.Scanner;

public class MaxExpression {
    public static int findMaxValue(int[] arr) {
    	int n = arr.length;
    	int maxResult = Integer.MIN_VALUE;
    	
    	int[] maxLeft = new int[n];
    	int[] minRight = new int[n];
    	
    	maxLeft[0] = arr[0];
    	for(int i=1;i<n;i++) {
    		maxLeft[i] = Math.max( maxLeft[i-1] , arr[i]);
    	}
    	
    	minRight[n-1] = arr[n-1];
    	for(int i=n-2;i>=0;i--) {
    		minRight[i] = Math.min(minRight[i+1], arr[i]);
    	}
    	
    	for(int j=1;j<n-1;j++) {
    		int value = maxLeft[j-1] + arr[j] - minRight[j+1];
    		maxResult = Math.max(maxResult, value);
    	}
    	return maxResult;
    	
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			int n = scanner.nextInt();
			int [] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = scanner.nextInt();
			}
			
			int result = findMaxValue(arr);
			System.out.println(result);
			}

}
