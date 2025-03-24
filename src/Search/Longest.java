package Search;

import java.util.HashSet;
import java.util.Set;

public class Longest {
	 public int longestConsecutive(int[] nums) {
		 Set<Integer> numSet = new HashSet<>();
		 int maxlength=0;
		 int current = 0;
		 int currentLength = 0;
		 for(int num:nums) {
			 numSet.add(num);
		 }
		 for(int num:nums) {
			 if(!numSet.contains(num -1)) {
				  current = num;
				  currentLength = 1;
			 }
			 while(numSet.contains(current+1)) {
				 current+=1;
				 currentLength+=1;
			 }
			 if (maxlength < currentLength) {
				    maxlength = currentLength;
				}

		 }
		return maxlength;
	    }
	public static void main(String[] args) {
		Longest longest = new Longest();
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longest.longestConsecutive(nums));

	}

}
