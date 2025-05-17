package Search;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
    	HashMap<Integer, Integer> check = new HashMap<>();
        for(int i =0;i<nums.length;i++) {
        	int remain = target - nums[i];
        	if(check.containsKey(remain)) {
        		return new int[] { check.get(remain),i};
        	}
        	
        		  check.put(nums[i], i);
        }
        		  return new int[] {};
}

    public static void main(String[] args) {
		int [] nums = {2,7,11,15};
		int target = 9;
		System.out.println(Arrays.toString(twoSum(nums, target)));
	}
}


