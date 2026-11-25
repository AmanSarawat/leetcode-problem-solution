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

    public int minDepth(TreeNode root) {

        // Empty tree
        if (root == null) {
            return 0;
        }

        // Leaf node
        if (root.left == null && root.right == null) {
            return 1;
        }

        // If left subtree is null
        if (root.left == null) {
            return 1 + minDepth(root.right);
        }

        // If right subtree is null
        if (root.right == null) {
            return 1 + minDepth(root.left);
        }

        // Minimum of left and right subtree
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}