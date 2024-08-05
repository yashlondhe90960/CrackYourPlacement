class Solution {
    public void flatten(TreeNode root) {
        helper(root);
    }

    public TreeNode helper(TreeNode node) {
        if (node == null) {
            return null;
        }

        if (node.left == null && node.right == null) {
            return node;

        }
        TreeNode leftTail = helper(node.left);
        TreeNode rightTail = helper(node.right);

        if (leftTail != null) {
            leftTail.right = node.right;
            node.right = node.left;
            node.left = null;
        }

        return rightTail == null ? leftTail : rightTail;

    }
}