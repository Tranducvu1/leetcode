package Search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFreaquence {
	public static int[] topKFrequent(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int num: nums) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		List<Map.Entry<Integer, Integer>> sortArray = new ArrayList<>(map.entrySet());
		sortArray.sort((entry1,entry2) -> entry2.getValue().compareTo(entry1.getValue()));
		int[] topkeys = sortArray.stream()
										.limit(k)
										.map(Map.Entry::getKey)
										.mapToInt(Integer::intValue)
										.toArray();
		
		return topkeys;
    }
public static void main(String[] args) {
	int [] nums = {1,1,1,2,2,3};
	int k = 2;
	System.out.println(Arrays.toString(topKFrequent(nums,k)));
}
}
