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
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx = findNode(root, x);
        TreeNode yy = findNode(root, y);

        return level(root, xx, 0) == level(root, yy, 0) && !isSiblings(root, xx, yy);
    }

    boolean isSiblings(TreeNode node, TreeNode x, TreeNode y) {
        if (node == null)
            return false;
        return ((node.left == x && node.right == y) || (node.left == y && node.right == x)
                || (isSiblings(node.left, x, y)) || (isSiblings(node.right, x, y)));
    }

    TreeNode findNode(TreeNode node, int x) {
        if (node == null)
            return node;
        if (node.val == x) {
            return node;
        }
        TreeNode left = findNode(node.left, x);
        if (left != null) {
            return left;
        }
        return findNode(node.right, x);
    }

    int level(TreeNode root, TreeNode x, int level) {
        if (root == null)
            return 0;
        if (root == x) {
            return level;
        }

        int left = level(root.left, x, level + 1);
        if (left != 0) {
            return left;
        }
        return level(root.right, x, level + 1);
    }
}
