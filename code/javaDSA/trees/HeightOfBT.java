package javaDSA.trees;

//Leetcode problem Height of a Binary Tree
public class HeightOfBT {
    int height(Node node) 
    {
        if(node==null){
            return 0;
        }
        int left = height(node.left);
        int right = height(node.right);
        
        return Math.max(left, right) + 1;
    }
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left=right=null;
        }

    }
}
