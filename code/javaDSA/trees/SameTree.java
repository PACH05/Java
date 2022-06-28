
//Leetcode question Same Tree
public class SameTree {
    public boolean isSameTree(Node p, Node q) {
        if (p == null && q == null) return true;
    // one of p and q is null
        if (q == null || p == null) return false;
        if (p.val != q.val) return false;
        
    return isSameTree(p.right, q.right) &&
            isSameTree(p.left, q.left);
    }
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
            left=right=null;
        }

    }
}
