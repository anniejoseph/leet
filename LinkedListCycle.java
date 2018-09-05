package Leet;
import java.util.HashMap;



public class LinkedListCycle {
/*
	public boolean hasCycle(ListNode head) {
		if(head==null){
        	return false;
    	}
        HashMap<ListNode, Integer > map= new HashMap<>();
        while(map.get(head.next)==null) {
			if(head.next==null)
				return false;
			map.put(head, head.val);
			head=head.next;
		}
		return true;
    }
*/
	
	public boolean hasCycle(ListNode head) {
		if(head==null){
        	return false;
    	}
		ListNode f=head,s=head;
		while(f!=null && f.next!=null) {
			f=f.next.next;
			s=s.next;
			if(f==s) {
				return true;
			}
		}
		return false;
		
	}
	
	
	public static void main(String[] args) {
		ListNode l1=new ListNode(1);
		ListNode l2=new ListNode(2);
		ListNode l3=new ListNode(5);
		ListNode l4=new ListNode(2);
		l1.next=l2;
		l2.next=l3;
		l3.next=l1;
		l4.next=null;
		LinkedListCycle l=new LinkedListCycle();
		System.out.println(l.hasCycle(l1));
		
	}

}
