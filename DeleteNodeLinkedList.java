package Leet;

class ListNode {
	     int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	 }
public class DeleteNodeLinkedList {
	
	
	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next=node.next.next;
	}
	
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(4);
		ListNode l2 = new ListNode(5);
		ListNode l3 = new ListNode(1);
		ListNode l4 = new ListNode(9);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		ListNode x = l1;
		while(x != null) {
			System.out.print(x.val+" ");
			x = x.next;
		}
		x=l1;
		System.out.println();
		DeleteNodeLinkedList obj = new DeleteNodeLinkedList();
		obj.deleteNode(l2);
		while(x != null) {
			System.out.print(x.val+" ");
			x = x.next;
		}
	}

}
