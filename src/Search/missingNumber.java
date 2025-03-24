package Search;

import java.util.Arrays;

public class missingNumber {
	
	public static void main(String[] args) {
		int arr[] = {0, 1, 2, 1, 2, 0};
		 Arrays.sort(arr);
        System.out.println("Số nhỏ nhất bị thiếu: " + Arrays.toString(arr));

	}

}
