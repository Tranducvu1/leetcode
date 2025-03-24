package Search;

public class CotainerMostwater {
	 public static int maxArea(int[] height) {
		 int maxAreanum  = 0;
			int left = 0;
			int right = height.length - 1;
			while(left < right ) {
				int currentMax = (right -left) * Math.min(height[left], height[right]);
				 maxAreanum = Math.max(maxAreanum, currentMax);
					
				 if(height[left] < height[right] ) {
					 left ++;
				 } else {
					 right--;
				 }
			}
		
	
		return maxAreanum;
	        
	    }
	 public static void main(String[] args) {
		int[] height = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));
	}
}
