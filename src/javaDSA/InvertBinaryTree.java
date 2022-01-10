package javaDSA;

public class InvertBinaryTree {
    public static void main(String[] args)
     {
        //https://leetcode.com/problems/invert-binary-tree/
    }
}
 class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) 
         {
             this.val = val;
             this.left = left;
             this.right = right;
        }
     }
   
   class Solution {
       public TreeNode invertTree(TreeNode root) {
           preorder(root);
           return root;
       }
   
       public void preorder(TreeNode root){
            if(root==null){
                return;
            }
            TreeNode temp=root.left;
            root.left=root.right;
            root.right=temp;
            preorder(root.left);
            preorder(root.right);
       }
   }
