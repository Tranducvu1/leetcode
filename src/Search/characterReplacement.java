package Search;

public class characterReplacement {
	 public int characterReplacement(String s, int k) {
		 int[] count = new int[26];
		 int left =0;
		 int maxLenght =0;
		 int maxFreq = 0;
		 for(int right=0;right<s.length();right++) {
			 count[s.charAt(right) - 'A']++;
			 maxFreq = Math.max(maxFreq,count[s.charAt(right) - 'A'] );
			 
			 if((right -left +1) - maxFreq >k ) {
				 count[s.charAt(right) - 'A']--;
				 left++;
			 }
		 }
		 return maxLenght;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
