package Search;

import Search.reorderList.ListNode;

public class hasCycle {
	public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
	
public boolean hasCycle(ListNode head) {
			if(head == null || head.next ==null ) return false;
			ListNode slow = head,fast = head.next;
			while(slow != fast) {
				if(fast == null ||fast.next == null) {
					return false;
				}
			}
			slow = slow.next;
			fast = fast.next.next;
			return true;
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
		// TODO Auto-generated method stub

	}

}
