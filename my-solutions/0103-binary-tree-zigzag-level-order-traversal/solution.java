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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null)
            return ans;
        q.offer(root);
        boolean leftToRight = true;
        while (!q.isEmpty()) {
            int level = q.size();
            List<Integer> current = new ArrayList<>();
            for (int i = 0; i < level; i++) {
                TreeNode node = q.poll();
                current.add(node.val);
                if (node.left != null)
                    q.offer(node.left);
                if (node.right != null)
                    q.offer(node.right);
            }
            if (!leftToRight) {
                Collections.reverse(current);
            }
            ans.add(current);
            leftToRight = !leftToRight;
        }

        return ans;
    }
}
