package javaDSA.mathAndMisc;

public class Quadratic {
    public static void main(String[] args) {
        int a = 1, b = 2, c = -1;
        
        System.out.println(solve(a,b,c));
    }

    private static int solve(int a, int b, int c) {
       int ans = 0;
        if(a > 0){
            int der = (-2)/(2*a);
            ans = a*(der*der) + b*der + c;
        }
        else if(a < 0){
            ans = c - ((b*b)/(4*a));
        }
        return ans;
    }
}
