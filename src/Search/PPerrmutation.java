package Search;

import java.util.Arrays;

public class PPerrmutation {
public static boolean checkInclusion(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();
		int [] count = new int[26];
		int [] countwindow = new int[26];	
		if(len1 > len2) return false;
		for(char c : s1.toCharArray()) {
			count[c - 'a']++;
		}
		for(int i=0;i< len2;i++) {
			countwindow[s2.charAt(i)- 'a']++;
			if(i>=len1) {
				countwindow[s2.charAt(i - len1)- 'a']--;
			}
			if(Arrays.equals(count, countwindow)) {
				return true;
			}
		}
		return false;
    }
	public static void main(String[] args) {	
		String s1 = "ab";
		String s2 = "eidboaoo";
		System.out.println(checkInclusion(s1,s2));
	}

}
