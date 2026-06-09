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

    int preindex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < inorder.length; i++) {
            mp.put(inorder[i], i);
        }
        return getTree(preorder, mp, 0, preorder.length-1);
    }
    public TreeNode getTree(int[] preorder, Map<Integer, Integer> mp, int l, int r) {
        if(l > r) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preindex]);
        int k = mp.get(preorder[preindex++]);
        root.left = getTree(preorder, mp, l, k-1);
        root.right = getTree(preorder, mp, k+1, r);
        return root;
    }
}
