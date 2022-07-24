package javaDSA.trees;

import java.util.ArrayList;

import javaDSA.trees.SameTree.Node;

public class BinaryTreePath {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.right = new Node(5);
        root.right = new Node(3);
        ArrayList<String> list = new ArrayList<>();
        list = findPaths(root);
        for (String string : list) {
            System.out.print(string+ ", ");
        }
    }

    private static ArrayList<String> findPaths(Node root) {
        ArrayList<String> ans = new ArrayList<>();
        String paths = "";
        if(root != null){
            searchBTPaths(root,paths,ans);
        }
        return ans;
    }

    private static void searchBTPaths(Node root, String paths, ArrayList<String> ans) {
        if(root.left == null && root.right == null) ans.add(paths + root.val);
        if(root.left != null) searchBTPaths(root.left, paths+root.val+"->", ans);
        if(root.right != null) searchBTPaths(root.right, paths+root.val+"->", ans);
    }    
}
