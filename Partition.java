 package linkedListProblems;

public class Partition {

	public static void main(String[] args) {

//		LinkedListNode a1 = new LinkedListNode(4, null);
		LinkedListNode a1 = new LinkedListNode(1, null);
		LinkedListNode a2 = new LinkedListNode(1, null);
//		LinkedListNode a3 = new LinkedListNode(3, null);
//		LinkedListNode a4 = new LinkedListNode(2, null);
//		LinkedListNode a5 = new LinkedListNode(5, null);
//		LinkedListNode a6 = new LinkedListNode(2, null);

		a1.next = a2;
//		a2.next = a3;
//		a3.next = a4;
//		a4.next = a5;
//		a5.next = a6;
		
		LinkedListNode head = a1;
		
		print(head);
		head = partion(head,0); 
		print(head);
	}

	private static LinkedListNode partion(LinkedListNode head, int k) {
		// TODO Auto-generated method stub
		
		if(head==null || head.next== null)
			return head;
		LinkedListNode cur = head,prev=null, head1 = new LinkedListNode(0,null), cur1= head1;
		while(cur != null)
		{
			if(cur.value >=k)
			{
				cur1.next = cur;
				cur1= cur1.next;
				if(prev!=null)
				{
					prev.next = cur.next;
				}
				else
				{
					head=head.next;
				}       
				cur= cur.next;
			}
			else
			{
				prev = cur;
				cur = cur.next;
			}
		 }
		cur1.next = null;

		prev.next = head1.next;

		return head;
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
