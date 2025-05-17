package Search;

import java.util.Arrays;

public class minEatingSpeed {
	 public static int minEatingSpeed(int[] piles, int h) {
		 int left =1, right = Arrays.stream(piles).max().getAsInt();
		 while(left < right) {
			 int mid = (left+right) /2;
			 int hour = 0;
			 for(int pile:piles) {
				 hour += (pile + mid - 1) /mid;
			 }
			 if(hour > h)  left = mid+1;
			 right = mid; 
		 }
		 return left;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] piles = {3,6,7,11};
		int k=8;
		System.out.println(minEatingSpeed(piles, k));
	}

}
