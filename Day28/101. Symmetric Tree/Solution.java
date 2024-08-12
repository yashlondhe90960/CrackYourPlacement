class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return false;
        return childrenAreSymmetric(root.left, root.right);

    }

    public boolean childrenAreSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if (left == null || right == null || left.val != right.val)
            return false;
        return childrenAreSymmetric(left.left, right.right) && childrenAreSymmetric(left.right, right.left);
    }
}