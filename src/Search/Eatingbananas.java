package Search;

public class Eatingbananas {
public static int findMin(int[] nums) {
	int left = 0, right = nums.length - 1;
	if(left< right ) {
		
		if (nums[left] < nums[right]) {
            return nums[left];
        }
		int mid = (left+right) /2;
		if(nums[right] < nums[mid]) {
		
			
			 left = mid+ 1;
		} else {
			right = mid ;
		}
	}
	
	return nums[left];
    }
	public static void main(String[] args) {
		int[] nums = {0,4,5,1,2};
			System.out.println(findMin(nums));
	}

}
