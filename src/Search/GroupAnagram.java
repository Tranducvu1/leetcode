package Search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
	public List<List<String>> groupAnagrams(String[] strs) {
		// tao map chứa key value ( ví key là vị trí sẽ là Srtring còn 
		//value là mảng giá trị sẽ là list
		Map<String, List<String>> map = new HashMap<>();
		for(String str : strs) {
			int [] CharCount = new int[26];
			for(char c : str.toCharArray()) {
				CharCount[c - 'a']++;
			}
			String key = Arrays.toString(CharCount);
			map.putIfAbsent(key, new ArrayList<String>());
			map.get(key).add(str);
		}
		return new ArrayList<>(map.values());
    }
}
