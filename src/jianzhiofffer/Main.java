package jianzhiofffer;

public class Main {

	/**
	 * ����ת
	 * 
	 * @param head
	 * @return
	 */
	public ListNode list_fanzhuan(ListNode head) {
		ListNode pre = null;
		ListNode next = null;
		while(head!=null) {
			next=head.next;
			head.next=pre;
			pre=head;
			head=next;
		}
		return pre;
	}
	
	
}
