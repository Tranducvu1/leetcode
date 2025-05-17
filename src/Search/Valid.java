package Search;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Valid {
public static boolean containsDuplicate(int[] nums) {
	Set<Integer> set = new HashSet<Integer>();
		for(int num : nums) {
			if(!set.add(num)) {
				return true;
			}
			return false;
		}
	return false;
        
    }
	public static void main(String[] args) {
		int[] nums = {1,2,3,1};
		System.out.println(containsDuplicate(nums));
	}

}
