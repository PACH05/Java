package javaDSA;

//Leetcode question
//Stairs can be crossed either by crossing 1 at a time or 2 at a time
public class ClimbingStairs {
            public static void main(String[] args) {
                int n=5;              //Number of stairs        
                int steps[] = new int[n];
                if(n<=0)
                    System.out.println("0");
                if(n==1)
                    System.out.println("1");
                else{
                    //This is a Dynamic Programming approach
                steps[0]=1;
                steps[1]=2;
                for (int i = 2; i <=n-1; i++) {
                    steps[i]=steps[i-1]+steps[i-2];
                }
                System.out.println(steps[n-1]);
            }
            }
}
