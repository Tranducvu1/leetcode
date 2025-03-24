package Search;

import java.util.HashMap;
import java.util.Map;

public class ComtainDuplicate {
	public static boolean hasDuplicate(int[] nums) {
		Map<Integer , Boolean> map = new HashMap<>();
		for(int num:nums) {
			if(map.containsKey(num)) {
				return true;
			}
			map.put(num, true);
		}
		return false;
	}
	public static void main(String[] args) {
		
		 int[] nums = {10, 20, 30, 30}; // Không có số trùng lặp
	        System.out.println(hasDuplicate(nums)); // Kết quả: false

	        int[] nums2 = {10, 20, 30, 40, 10}; // Có số trùng lặp
	        System.out.println(hasDuplicate(nums2)); // Kết quả: true
	}

}
