package javaDSA.otherAlgorithms.dynamicProgramming;

public class PaintHouse {

    public static void main(String[] args) {
        
        int houseNum = 4;
        int[][] cost = {{1,5,7},{5,8,4},{3,2,9},{1,2,4}};
        
        int dp[][] = new int[houseNum][3];
        int ans = minPaintCost(houseNum, cost,dp);
        System.out.println(ans);

    }

    //Tabulation
    
    private static int minPaintCost(int houseNum, int[][] cost, int[][] dp) {
        
        dp[0][0] = cost[0][0];
        dp[0][1] = cost[0][1];
        dp[0][2] = cost[0][2];

        for (int i = 1; i < cost.length; i++) {
            dp[i][0] = cost[i][0] +Math.min(dp[i-1][1], dp[i-1][2]);
            dp[i][1] = cost[i][1] + Math.min(dp[i-1][0], dp[i-1][2]);
            dp[i][2] = cost[i][2] + Math.min(dp[i-1][0], dp[i-1][1]);
        }
        
        return Math.min(dp[cost.length-1][0],Math.min(dp[cost.length-1][1],dp[cost.length-1][2]));
    }
    
}
