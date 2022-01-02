package linkedListProblems;

import java.math.BigInteger;
import java.util.HashMap;

public class CloneRandomPointer2 {
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
		LinkedListNode cur = head,head1,cur1;
		BigInteger a;
		while(cur!=null)
		{
			LinkedListNode temp = new LinkedListNode(cur.value, null);
			temp.next= cur.next;
			cur.next = temp;
			cur = cur.next.next;
		}

		print(head);
		
		cur = head;
		while(cur!=null)
		{
			cur.next.random = cur.random.next;
			cur = cur.next.next;
		}
		cur = head;
		head1 = cur.next;
		cur1= head1;
		while(cur!=null && cur1 !=null)
		{
			cur.next = cur.next.next;
			if(cur1.next != null)
			{
				cur1.next = cur1.next.next;
			}
			else
			{
				cur1.next= null;
			}
			cur = cur.next;
			cur1 = cur1.next;
			
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
