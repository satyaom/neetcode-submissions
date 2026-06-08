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
    public int kthSmallest(TreeNode root, int k) {
        int[] lt = new int[2];
        lt[0] = k;
        kthSmall(root, lt);
        return lt[1];
    }

    public void kthSmall(TreeNode root, int[] lt) {
        if(root == null) {
            return;
        }

        kthSmall(root.left, lt);
        if(lt[0] == 0) {
            return;
        }
        lt[0] -= 1;
        if(lt[0] == 0) {
            lt[1] = root.val;
            return;
        }
        kthSmall(root.right, lt);
    }
}
