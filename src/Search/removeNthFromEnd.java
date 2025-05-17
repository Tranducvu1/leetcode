package Search;

public class removeNthFromEnd {
public static class ListNode {
	int val;
	ListNode next;
	ListNode(int x){
		this.val = x;
	}
}
public ListNode removeNthFromEnd(ListNode head, int n) {
			ListNode dummy = new ListNode(0);
			dummy.next = head;
			ListNode slow = dummy;
			ListNode fast = dummy;
			for(int i=0;i<n;i++) {
				fast = fast.next;
			}
			
			while(fast.next != null) {
				fast  =fast.next;
				slow = slow.next;
			}
			
			slow.next = slow.next.next;
			return dummy.next;
    }
	public static ListNode buildList(int[] arr) {
		if(arr.length == 0 ) return null;
		ListNode head = new ListNode(arr[0]);
		ListNode current = head;
		for(int i=1;i< arr.length;i++) {
			current.next = new ListNode(arr[i]);
			current  = current.next;
		}
		return head;
	}
	public static void print(ListNode head) {
		while(head != null) {
			System.out.print(head.val);
			if(head.next != null ) System.out.println(" -> ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] value = {1,2,3,4,5};
		ListNode head =buildList(value);
		
		System.out.println();
		print(head);
		
		removeNthFromEnd rm = new removeNthFromEnd();
		rm.removeNthFromEnd(head, 2);
		
		System.out.println("After ");
		print(head);
	}

}
