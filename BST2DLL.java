package linkedListProblems;

import treesProblems.TreeNode;

public class BST2DLL {

	static TreeNode prev = null;
	static TreeNode head;
	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(25);
	        root.Left = new TreeNode(12);
	        root.Right = new TreeNode(36);
	        root.Left.Left = new TreeNode(10);
	        root.Left.Right = new TreeNode(15);
	        root.Right.Left = new TreeNode(30);
	  
	        // convert to DLL
	        BinaryTree2DoubleLinkedList(root);
	          
	        // Print the converted List
	        printList(head);
	}

    /* Function to print nodes in a given doubly linked list */
    static void printList(TreeNode node)
    {
        while (node != null)
        {
            System.out.print(node.data + " ");
            node = node.Right;
        }
    }
    
	static void BinaryTree2DoubleLinkedList(TreeNode root)
    {
        // Base case
        if (root == null)
            return;
  
        // Recursively convert left subtree
        BinaryTree2DoubleLinkedList(root.Left);
  
        // Now convert this node
        if (prev == null)
            head = root;
        else
        {
            root.Left = prev;
            prev.Right = root;
        }
        prev = root;
  
        // Finally convert right subtree
        BinaryTree2DoubleLinkedList(root.Right);
    }
  
}
