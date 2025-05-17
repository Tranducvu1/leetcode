package Search;

import java.util.Arrays;



public class reorderList {
	

public static class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
public void reorderList(ListNode head) {
	if(head == null || head.next == null) return;   
	ListNode slow = head,fast = head;
	while(fast != null && fast.next != null && slow != null && slow.next != null) {
		//slow nó chạy ngang giữa rồi dò ngược lại
		slow = slow.next;
		//fasst chạy đến đuôi
		fast = fast.next.next;
	}
		ListNode second = reverse(slow.next);
		slow.next = null;
		ListNode first = head;
			while(second != null){
				//hiển thị chồng chèo 2 array
				ListNode tmp1 = first.next;
				ListNode tmp2 = second.next;
				
				first.next = second;
				second.next = tmp1;
				
				first = tmp1;
				second  = tmp2; 
			}
	}
		
	
	//revverse đảo chiều
	 private ListNode reverse(ListNode head) {
		 ListNode prev = null;
		 while(head != null) {
			 ListNode nextemp = head.next;
			 head.next = prev;
			 prev = head;
			 head = nextemp;
		 }
		 return prev;
	 
}
	    public static ListNode buildList(int[] arr) {
	    	if(arr.length == 0) return null;
	    	ListNode head = new ListNode(arr[0]);
	    	ListNode current = head;
	    	for(int i=1;i<arr.length;i++) {
	    		current.next = new ListNode(arr[i]);
	    		current = current.next;
	    		
	    	}
	    	return head;
	    }
	 public static void print(ListNode head) {
		 while( head != null) {
			 System.out.print(head.val);
			 if (head.next != null) System.out.print(" -> ");
	            head = head.next;
		 }
		 System.out.println();
	 }
	 public static void main(String[] args) {
	        int[] values = {1, 2, 3, 4};
	        ListNode head = buildList(values);

	        System.out.print("Before: ");
	        print(head);

	        reorderList rl = new reorderList();
	        rl.reorderList(head);

	        System.out.print("After:  ");
	        print(head);
	    }
}
