package Search;

public class SolutionBinary {
public static int binarysearch(int[] arr, int k) {
        int left =0;
        int result = 0;
        int right = arr.length - 1;
        while(left <= right ) {
        	int mid = left+(right-left) /2;
        	if(arr[mid] == k) {
        		result = mid;
        		right = mid - 1;
        	}	else if(arr[mid] < k) {
        		left = mid+1;
        	} else {
        		right = mid -1;
        	}
        	
        }
        return result;
    }
	public static void main(String[] args) {
		int [] arr = {1, 1, 1, 1, 2};
		int k = 1;
		System.out.println(binarysearch(arr, k));
	}
}
