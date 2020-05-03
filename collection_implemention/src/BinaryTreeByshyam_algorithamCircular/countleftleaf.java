package BinaryTreeByshyam_algorithamCircular;

import BinaryTreeByshyam_algorithamCircular.BinaryTree.TreeNode;

public class countleftleaf
{
	// Recursive Solution
		/* To get the count of leaf nodes in a binary tree*/
		public static  int getLeafCountOfBinaryTree(TreeNode node)
		{
			if(node == null)      
				return 0;
			if(node.left ==null && node.right==null)     
				return 1;           
			else
				return getLeafCountOfBinaryTree(node.left)+ getLeafCountOfBinaryTree(node.right);     
		}
}
