package Search;

public class Anagram {
	 public boolean isAnagram(String s, String t) {
	        if(s.length() != t.length()) {
	        	return false;
	        }
	        int [] CharCount = new int[26];
	        for(int i=0;i < s.length();i++) {
	        	CharCount[s.charAt(i) - 97]++;
	        	CharCount[t.charAt(i) -97]--;
	        }
			for(int count : CharCount) {
				if(count != 0) {
					return false;
				}
				return true;
			}
	        
	        return true;
	    }
}
