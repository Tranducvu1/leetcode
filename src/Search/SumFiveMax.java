package Search;

import java.util.PriorityQueue;

public class SumFiveMax {
	public static int sumfivemax(int[] nums) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int num: nums) {
			if(pq.size() <5) {
				pq.add(num);
			} else if(num > pq.peek()){
				pq.poll();
				pq.add(num);
			}
		}
		int sum =0;
		for(int num:pq) {
			sum+=num;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {1, 3, 4, -1, -9, 3, 4, 5};
        System.out.println("Tổng 5 số lớn nhất: " + sumfivemax(nums));
	}
}
