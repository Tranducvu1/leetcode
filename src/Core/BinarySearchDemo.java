package Core;

public class BinarySearchDemo {
	public static int binarySearch(int[] arr, int target) {
		int left=0;
		int right = arr.length-1;
		while(left <= right) {
			int mid = left +(right -left) /2;
			if(arr[mid] == target) {
				return mid;
			} else if(arr[mid] < target) {
				left = mid+1;
			} else {
				right = mid-1;
			}
			
		}
		return -1;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1, 3, 5, 6, 8, 9}; // Must be sorted
        int targetValue = 6;

        int result = binarySearch(numbers, targetValue);

        if (result != -1) {
            System.out.println("Value " + targetValue + " found at index " + result + ".");
        } else {
            System.out.println("Value " + targetValue + " not found in the array.");
        }
	}

}
