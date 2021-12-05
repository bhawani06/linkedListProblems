package linkedListProblems;

public class ReverseKNodes {
	public static void main(String[] args) {

		LinkedListNode a1 = new LinkedListNode(1, null);
		LinkedListNode a2 = new LinkedListNode(2, null);
		LinkedListNode a3 = new LinkedListNode(3, null);
		LinkedListNode a4 = new LinkedListNode(4, null);
		LinkedListNode a5 = new LinkedListNode(5, null);
		LinkedListNode a6 = new LinkedListNode(6, null);

		a1.next = a2;
		a2.next = a3;
		a3.next = a4;
		a4.next = a5;
		a5.next = a6;
		LinkedListNode head = a1;
		LinkedListNode q = new LinkedListNode(6, null);
		print(head);
		head = reverseKNodes(head,3);
		print(head);
		
	}


	private static LinkedListNode reverseKNodes(LinkedListNode head, int k) {
		// TODO Auto-generated method stub
		if(head==null || head.next== null)
		{
			return head;
		}
		LinkedListNode prev = null, cur = head, nextnode=null;
		
		int count = 0;
		while (cur!=null && count <k)
		{
			nextnode = cur.next;
			cur.next = prev;
			prev = cur;
			cur = nextnode;
			++count;
		}

		if(nextnode!=null)
			head.next = reverseKNodes(nextnode, k); //imp - head.next
		
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
