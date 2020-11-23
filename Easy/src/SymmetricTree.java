class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        return root == null || checkSymmetric(root.left, root.right);
    }

    public boolean checkSymmetric(TreeNode left, TreeNode right) {
        if (left == null || right == null)
            return left == right;
        else if (left.val != right.val)
            return false;
        return checkSymmetric(left.left, right.right) && checkSymmetric(left.right, right.left);
    }
}
