package Search;

public class TrappingRain {
	  public static int trap(int[] height) {
	      int left = 0;
	      int right = height.length -1;
	      int maxLeft = 0;
	      int maxRight = 0;
	      int water = 0;
	      while(left < right ) {
	    	  if(height[left] < height[right]) {
	    		  if(height[left] < maxLeft) {
	    			  water +=maxLeft - height[left];
	    		  } else {
	    			 maxLeft = height[left];
	    		  }
	    		  left++;
	    	  } else {
	    		  if(height[right] < maxRight) {
	    			water +=maxRight - height[right];
	    		  } else {
	    			  maxRight = height[right]; 
	    		  }
	    		  right --;
	    	  }
	      }
		return water;
		  
	    }
	  
	  public static void main(String[] args) {
		int[] height = {4,2,0,3,2,5};
		System.out.println(trap(height));
	}
}
