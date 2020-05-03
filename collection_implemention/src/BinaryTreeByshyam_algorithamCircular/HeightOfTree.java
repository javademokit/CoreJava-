package BinaryTreeByshyam_algorithamCircular;

import BinaryTreeByshyam_algorithamCircular.BinaryTree.TreeNode;

public class HeightOfTree
{
	public static void main(String[] args) {

		BinaryTree binaryTree = new BinaryTree();

		/**
		 * Binary Tree in our example, height = 2
		 * 		1		(Root)
		 * 	  2	  3		(Level 1)
		 *  4    	 5		(Level 2)
		 */
		binaryTree.root = new TreeNode(1);
		binaryTree.root.left = new TreeNode(2);
		binaryTree.root.right = new TreeNode(3);
		binaryTree.root.left.left = new TreeNode(4);
		binaryTree.root.right.left = new TreeNode(5);
		int heightOfTree = height(binaryTree.root);
		System.out.printf("Height of tree is %d", heightOfTree);
	}
	public static int height(TreeNode root) {
		if (root == null)
			return -1;
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);

		return Math.max(leftHeight, rightHeight) + 1;
	}
}
