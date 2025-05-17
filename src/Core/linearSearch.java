package Core;

public class linearSearch {
	 public static int linearSearch(int[] arr, int target) {
		 	for(int i=0;i<arr.length;i++) {
		 		if(arr[i] == target) {
		 			return i;
		 		}
		 		
		 	}
			return -1;
		 
	 }
	public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 6, 1, 9};
        int targetValue = 6;

        int result = linearSearch(numbers, targetValue);

        if (result != -1) {
            System.out.println("Value " + targetValue + " found at index " + result + ".");
        } else {
            System.out.println("Value " + targetValue + " not found in the array.");
        }
    }
}	
