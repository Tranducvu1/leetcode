package Search;

public class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;  // Fix "hight" to "high"
        while (low <= high) {
            int mid = low + (high - low) / 2;  // Calculate mid
            if (nums[mid] == target) {
                return mid;  // Return the index if target is found
            }
            if (nums[mid] < target) {
                low = mid + 1;  // Search right half
            } else {
                high = mid - 1;  // Search left half
            }
        }
        return -1;  // Return -1 if target is not found
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        // Example test case
        int[] nums = {-1,0,3,5,9,12};
        int target = 2;
        System.out.println(solution.search(nums, target));  // Should output 4
    }
}
