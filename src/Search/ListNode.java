package Search;

public class ListNode {
	int val;
	ListNode next;
	ListNode(int x){
		val = x;
	}
	 public static ListNode reverseList(ListNode head) {
		 ListNode prev = null;
		 ListNode curr = head;
		 while(curr != null) {
			 ListNode next = curr.next;
			 curr.next = prev;
			 prev = curr;
			 curr = next;
		 }
		 return prev;
	 }
	 
	 public static void print(ListNode head) {
		 while(head != null) {
			 System.out.print(head.val);
			 if(head.next != null) 
				 System.out.print("->");
			 head = head.next;
		 }
		 System.out.println();
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		
		System.out.print("Original List: ");
		print(head);
		
		ListNode reverseList = reverseList(head);
		System.out.print("Reversed List: ");
		print(reverseList);
		
	}

}
