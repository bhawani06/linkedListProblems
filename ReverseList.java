package linkedListProblems;

public class ReverseList {
	public static void main(String[] args) {
		LinkedListNode a = new LinkedListNode(1, null);
		LinkedListNode b = new LinkedListNode(2, null);
		LinkedListNode c = new LinkedListNode(4, null);
		LinkedListNode d = new LinkedListNode(7, null);
		
		a.next = b;
		b.next =c;
		c.next = d;
		
		LinkedListNode head = a;
		LinkedListNode q = new LinkedListNode(6, null);
		print(head);
		head = reverse(head);
		print(head);
		
	}


	private static LinkedListNode reverse(LinkedListNode head) {
		// TODO Auto-generated method stub
		if(head==null || head.next== null)
		{
			return head;
		}
		LinkedListNode prev = null, cur = head, nextnode;
		
		while (cur!=null)
		{
			nextnode = cur.next;
			cur.next = prev;
			prev = cur;
			cur = nextnode;
		}
		
		return prev;
	}


	private static void print(LinkedListNode head) {
		// TODO Auto-generated method stub

		System.out.println();
		LinkedListNode cur = head;
		while(cur != null)
		{
			System.out.print(cur.value + "->");
			cur = cur.next;
		}

		System.out.print("null");
	}


}
