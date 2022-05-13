package javaDSA.backtracking;

public class GridPathCount {

    public static void main(String[] args) {
        int m = 4, n = 4;    
        int path = pathcount(0,0,m,n);
        System.out.println(path);
    }

    private static int pathcount(int i, int j, int m, int n) {
        if(i==m || j == n){
            return 0;
        }
        if(i ==m-1 || j == n-1){
            return 1;
        }

        int right = pathcount(i, j+1, m, n);
        int down = pathcount(i+1, j, m, n);
        
        return right+ down;
    }
    
}
