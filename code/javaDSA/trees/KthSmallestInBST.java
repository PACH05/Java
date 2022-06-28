

import java.util.ArrayList;

//Leetcode Question Kth Smallest Element in Binary Search Tree
public class KthSmallestInBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        int ans = KthSmallest(root, 2);
        System.out.println(ans);
    }

    public static int KthSmallest(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);
        int ans = list.get(k - 1);
        return ans;
    }

    public static void inorder(TreeNode root, ArrayList<Integer> list) {
        if (root == null)
            return;

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    static class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        public TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }
}
