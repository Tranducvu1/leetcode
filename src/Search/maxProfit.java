package Search;

import java.util.HashSet;

public class maxProfit {
//	public static int characterReplacement(String s, int k) {
//        int [] count = new int[26];
//        int left =0;
//        int maxFreq =0;
//        int maxLength = 0;
//        for(int right=0;right<s.length();right++) {
//        	count[s.charAt(right) - 'A']++;
//        	maxFreq = Math.max(maxFreq, count[s.charAt(right) - 'A']);
//        
//        if((right - left+1 -maxFreq) > k) {
//        	count[s.charAt(right)-'A']--;
//        	left++;
//        }    
//        maxLength = Math.max(maxLength, right - left+1);
//        }
//        return maxLength;
//    }
	 public static int maxProfit(int[] prices) {
		if(prices == null || prices.length ==0 ) return 0; 
		 int minPrices = Integer.MAX_VALUE;
		 int maxBenefit = 0;
		 for(int price:prices) {
			 if(minPrices > price) {
				 minPrices = price;
			 }
			 maxBenefit = Math.max(maxBenefit, price - minPrices);
	 }
		 return maxBenefit;
	 }
public static void main(String[] args) {
  //  String  s = "ABAB";
  //  int k = 2;
    //System.out.println(characterReplacement(s,k)); 
	int[]  prices = {7,1,5,3,6,4};
	System.out.println(maxProfit(prices));
}
}
