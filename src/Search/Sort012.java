package Search;

import java.util.PriorityQueue;

public class Sort012 {
	 public static int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int num: arr) {
        	pq.add(num);
        }
        
        for(int i=0;i< k-1;i++) {
        	pq.poll();
        }
        
        return pq.peek();
    }
	
	
	public static void main(String[] args) {
		int [] arr = {7, 10, 4, 3, 20, 15};
		int k = 3;
		System.out.println(kthSmallest(arr, k));
	}
}
