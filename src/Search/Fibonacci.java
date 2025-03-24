package Search;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    // Function to return list containing first n Fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        if (n <= 0) return new int[0]; // Trả về mảng rỗng nếu n <= 0

        int[] fib = new int[n]; // Mảng lưu kết quả

        fib[0] = 0; // Số Fibonacci đầu tiên
        if (n > 1) fib[1] = 1; // Số Fibonacci thứ hai (n >= 2 mới gán)

        // Tính các số Fibonacci tiếp theo
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] result = fibonacciNumbers(n);

        System.out.print("Dãy Fibonacci " + n + " số đầu tiên: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
