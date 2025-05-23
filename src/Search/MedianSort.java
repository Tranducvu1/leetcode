package Search;

public class MedianSort {
	 public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		 if (nums1.length > nums2.length) {
	            return findMedianSortedArrays(nums2, nums1);
	        }
	        
			 int m = nums1.length;
			 int n = nums2.length;
			 int left = 0;
			 int right = m;
			 while(left <= right) {
				int partition1 = (left+right) /2;
				System.out.println(partition1);
				int partition2 = (m+n+1) /2 - partition1;
				//boundary value
				int maxLeft1 = (partition1 == 0) ? Integer.MIN_VALUE : nums1[partition1 -1];
				int minRight1 = (partition1 == m) ? Integer.MAX_VALUE : nums1[partition1];
				
				int maxLeft2 = (partition2 == 0) ? Integer.MIN_VALUE : nums2[partition2 -1];
				int minRight2 = (partition2 == n) ? Integer.MAX_VALUE : nums2[partition2];
				
				if(maxLeft1 <= minRight2 && minRight1 >= maxLeft2) {
					if((m+n) %2 ==0 ) {
						return (Math.max(maxLeft2, maxLeft1)+ Math.min(minRight1, minRight2)) /2.0;
					} else {
						return Math.max(maxLeft2, maxLeft1);
					}
				} else if(maxLeft1 < minRight2){
					left = partition1 +1;
				} else {
					right = partition1 -1;
				}
			 }
		 
		return 0;
	        
	    }
	
	public static void main(String[] args) {
		int[] nums1 = {1,3};
		int[] nums2 = {2};
		System.out.println(findMedianSortedArrays(nums1,nums2));
	}
}
