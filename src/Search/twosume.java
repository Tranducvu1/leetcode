package Search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class twosume {
	public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {

		Set<Integer> seen = new HashSet<>();
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		for(int c:arr) {
			if(seen.contains(-c)) {
				result.add(new ArrayList<Integer>(Arrays.asList(-c,c)));
			}
			seen.add(c);
		}
		return result;
        // code here
    }
	public static void main(String[] args) {
		int [] arr = {1, 20, -1, 2, 23, 90, 80};
		List<ArrayList<Integer>> pairs = getPairs(arr);
		System.out.println(pairs);

	}

}
