package linkedListProblems;

import treesProblems.TreeNode;

public class BST2DLL {

	static TreeNode prev = null;
	static TreeNode head;
	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(4);
	        root.left = new TreeNode(2);
	        root.right = new TreeNode(5);
	        root.left.left = new TreeNode(1);
	        root.left.right = new TreeNode(3);
	  
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
            System.out.print(node.val + " ");
            node = node.right;
        }
    }
    
	static void BinaryTree2DoubleLinkedList(TreeNode root)
    {
        // Base case
        if (root == null)
            return;
  
        // Recursively convert left subtree
        BinaryTree2DoubleLinkedList(root.left);
  
        // Now convert this node
        if (prev == null)
            head = root;
        else
        {
            root.left = prev;
            prev.right = root;
        }
        prev = root;
  
        // Finally convert right subtree
        BinaryTree2DoubleLinkedList(root.right);
    }
  
}
