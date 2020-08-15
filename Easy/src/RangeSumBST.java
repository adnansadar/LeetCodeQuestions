/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     public int rangeSumBST(TreeNode root, int L, int R) 
     {
     	if(root == null) //base case
     	{
     		return 0;
     	}
     	if(root.val<L) //ignoring the left subtree
     	{
     		rangeSumBST(root.right,L,R);
     	}
     	if(root.val>R) //ignoring the right subtree
     	{
     		rangeSumBST(root.left,L,R);
     	}
     	return root.val + rangeSumBST(root.left,L,R) + rangeSumBST(root.right,L,R);
     }
 }