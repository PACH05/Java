package javaDSA.trees;
import javaDSA.trees.HeightOfBT.Node;
//Convert sorted array to a height balanced Binary Tree

public class SortedArrToBST {
    public static void main(String[] args) {
        int arr[] = {-10,-3,0,3,10};
        Node nd= arrToBST(arr);
        System.out.println(nd.data);
    }

    private static Node arrToBST(int[] nums){
        if(nums.length == 0) return null;
        int n = nums.length - 1;
        Node root = helper(nums, 0, n);
        return root;
    }

    private static Node helper(int[] nums, int low, int high) {
        if(low>high)return null;
        
        int mid = (low+high)/2;
        Node node = new Node(nums[mid]);
        node.left = helper(nums, low, mid-1);
        node.right = helper(nums, mid+1, high);
        return node;
    }
    
}
