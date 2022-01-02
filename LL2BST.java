package linkedListProblems;

import java.util.LinkedList;
import java.util.Queue;

import treesProblems.TreeNode;

public class LL2BST {

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
		
		TreeNode root = llTBst(head,0,5);
		PrintTree_LevelOrder(root);
	}
	
	
	
	private static TreeNode llTBst(LinkedListNode head, int start,int end) {
		// TODO Auto-generated method stub
		if(start>end || head == null)
			return null;
		int m = start + (end-start)/2;

		TreeNode left = llTBst(head, start, m-1);
		TreeNode root = new TreeNode(head.value);
		root.left = left;
		if(head.next !=null)
		{
			head.value= head.next.value;
			head.next = head.next.next;
		}
		root.right= llTBst(head, m+1, end);
		return root;
		
	}

	private static void PrintTree_LevelOrder(TreeNode root) {
		// TODO Auto-generated method stub
		if(root == null)
			return;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while(! q.isEmpty())
		{
			TreeNode tmp= q.remove();
			System.out.println(tmp.val);
			if(tmp.left != null)
			{
				q.add(tmp.left);
			}
			if(tmp.right!=null)
			{
				q.add(tmp.right);
			}
		}
	}
}
