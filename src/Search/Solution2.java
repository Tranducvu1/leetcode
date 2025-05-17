package Search;

import java.util.Arrays;

public class Solution2 {
	 public static int[] productExceptSelf(int[] nums) {
	        int n = nums.length;
	        int [] answer = new int[n];
	        answer[0] = 1;
	        for(int i=1;i<n;i++) {
	        	answer[i] =answer[i-1]* nums[i-1];
	        }
	        
	        int prefix =1;
	        for(int i = n-1;i>=0;i--) {
	        	answer[i] *= prefix;
	        	prefix*= nums[i];
	        }
	        return answer;
	    }
	public static void main(String[] args) {
		int [] nums = {1,2,3,4};
		System.out.println(Arrays.toString(productExceptSelf(nums)));
	}

}
