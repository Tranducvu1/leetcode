package CodeFores;

import java.util.Scanner;

public class MaxPairSum {
    public static int findMaxPairSum(int[] arr) {
    	int n = arr.length;
    	int maxRessult = Integer.MIN_VALUE;
    	
    	int maxLeft = arr[0];
    	for(int i=1;i<n;i++) {
            int currentSum = maxLeft + arr[i];
    		maxRessult = Math.max(maxRessult, currentSum);
    		maxLeft = Math.max(maxLeft, arr[i]);
    		
    	}
    	return maxRessult;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			int n = scanner.nextInt();
			int [] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = scanner.nextInt();
			}
			
			int result = findMaxPairSum(arr);
			System.out.println(result);
			}

}
