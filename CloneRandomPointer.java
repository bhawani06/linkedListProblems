package linkedListProblems;

import java.util.HashMap;

public class CloneRandomPointer {

	public static void main(String[] args) {
		LinkedListNode a1 = new LinkedListNode(1, null);
		LinkedListNode a2 = new LinkedListNode(2, null);
		LinkedListNode a3 = new LinkedListNode(3, null);
		LinkedListNode a4 = new LinkedListNode(4, null);
		LinkedListNode a5 = new LinkedListNode(5, null);

		a1.next = a2;
		a2.next = a3;
		a3.next = a4;
		a4.next = a5;

		a1.random = a4;
		a2.random = a5;
		a3.random = a1;
		a4.random = a3;
		a5.random = a1;
		
		LinkedListNode head = a1;
		LinkedListNode q = new LinkedListNode(6, null);
		print(head);
		printRandom(head);
		LinkedListNode cloneHead = clone(head);
		print(cloneHead);
		printRandom(cloneHead);
		
	}

	private static LinkedListNode clone(LinkedListNode head) {
		// TODO Auto-generated method stub
		LinkedListNode cur = head;
		LinkedListNode cur1 , head1 = null;
		
		HashMap<LinkedListNode, LinkedListNode> hm = new HashMap<LinkedListNode, LinkedListNode>();
		
		while (cur!= null)
		{
			hm.put(cur, new LinkedListNode(cur.value, null));
			cur = cur.next;
		}
		
		cur = head;
		head1 = hm.get(head);
		 
		while(cur != null)
		{
			hm.get(cur).next = hm.get(cur.next);
			hm.get(cur).random = hm.get(cur.random);
			cur = cur.next;
		}
		
		return head1;
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

	private static void printRandom(LinkedListNode head) {
		// TODO Auto-generated method stub

		System.out.println();
		LinkedListNode cur = head;
		while(cur != null)
		{
			System.out.print(cur.random.value + "->");
			cur = cur.next;
		}

		System.out.print("null");
	}

}
