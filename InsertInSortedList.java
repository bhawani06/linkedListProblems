package linkedListProblems;

public class InsertInSortedList {
	
	public static void main(String[] args) {
		LinkedListNode a = new LinkedListNode(1, null);
		LinkedListNode b = new LinkedListNode(2, null);
		LinkedListNode c = new LinkedListNode(4, null);
		
		a.next = b;
		b.next =c;
		
		LinkedListNode head = a;
		LinkedListNode q = new LinkedListNode(6, null);
		print(head);
		head = insert(head, q);
		print(head);
		
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

	private static LinkedListNode insert(LinkedListNode head, LinkedListNode q) {
		// TODO Auto-generated method stub
		if(head == null)
		{
			head = q;
			return head;
		}
		if(q == null)
		{
			return head;
		}
		
		LinkedListNode cur = head, p = null;
		
		while (cur != null && cur.value < q.value)
		{
			p = cur;
			cur = cur.next;
		}
		
		if(p!= null)
		{
			p.next = q;
			q.next = cur;
		}
		else
		{
			q.next= head;
			head = q;
		}
		return head;
		
	}
}

