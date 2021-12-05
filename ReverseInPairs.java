package linkedListProblems;

public class ReverseInPairs {
	public static void main(String[] args) {
		LinkedListNode a = new LinkedListNode(1, null);
		LinkedListNode b = new LinkedListNode(2, null);
		//LinkedListNode c = new LinkedListNode(4, null);
		//LinkedListNode d = new LinkedListNode(7, null);
		
		a.next = b;
		//b.next =c;
		//c.next = d;
		
		LinkedListNode head = a;
		LinkedListNode q = new LinkedListNode(6, null);
		print(head);
		head = reverse(head);
		print(head);
		
	}


	private static LinkedListNode reverse(LinkedListNode head) {
		if(head == null || head.next == null)
		{
			return null;
		}
		
		LinkedListNode dummy = new LinkedListNode(0, null), cur,f,s;
		dummy.next = head;
		cur = dummy;
		while(cur != null && cur.next != null&& cur.next.next != null)
		{
			f = cur.next;
			s = cur.next.next;
			cur.next = s;
			f.next = s.next;
			s.next = f;
			cur = f;
		}
		
		return dummy.next;
	}


	private static void print(LinkedListNode head) {
		
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
