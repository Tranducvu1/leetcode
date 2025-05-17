package Search;

public class Anagram {
	 public static boolean isAnagram(String s, String t) {
		 int a1 = s.length();
		 int a2 = s.length();
		 if(a1 != a2) return false;
		 int[] count = new int[26];
		 for(int i=0;i<a1;i++) {
			 count[s.charAt(i) - 97]--;
			 count[t.charAt(i)- 97]++;
		 }
		 for(int nums:count) {
			 if(nums == 0 ) {
				 return true;
			 }
		 }
		 return false;
	 }
	 
	 public static void main(String[] args) {
		String  s = "rat"; 
		String t = "car";
		System.out.println(isAnagram(s,t));
	}
}
