//Amazon Interview
//Given two non-empty binary trees s and t, check whether tree t has exactly the same structure and node values with a subtree of s. A subtree of s is a tree consists of a node in s and all of this node's descendants.
// The tree s could also be considered as a subtree of itself.
public class SubtreeofAnotherTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }
    public static boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) {//base condition for recursion
            return false;
        } else if (isSameTree(s, t)) { //if any subtree is equal start checking and return true
            return true;
        } else {
            return isSubtree(s.left, t) || isSubtree(s.right, t); //traversing the left and right nodes of the t tree
        }
    }

    public static boolean isSameTree(TreeNode s, TreeNode t){
        if(s==null || t==null){ //base condition to exit recursion
            return s == null && t==null;
        }
        else if(s.val == t.val){
            return isSameTree(s.left,t.left) && isSameTree(s.right,t.right); //if both are equal then only
        }
        else{
            return false;
        }
    }
}
