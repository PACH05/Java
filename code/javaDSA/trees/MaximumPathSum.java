package javaDSA.trees;


public class MaximumPathSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        int sum = maxPathSum(root);
        System.out.println(sum);
    }
    public static int maxPathSum(TreeNode root) {
        int max[] = new int[1];
        max[0] = Integer.MIN_VALUE;
        int a = maxPathCalc(root, max);
        return max[0];
    }
    
    public static int maxPathCalc(TreeNode node, int[] max){
        if(node == null) return 0;
        
        int leftSum = Math.max(0, maxPathCalc(node.left, max));
        int rightSum = Math.max(0, maxPathCalc(node.right, max));
        
        max[0] = Math.max(max[0], leftSum+rightSum+node.val);
        
        return Math.max(leftSum, rightSum)+node.val;
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
