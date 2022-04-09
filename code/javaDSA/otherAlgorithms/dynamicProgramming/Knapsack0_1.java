package javaDSA.otherAlgorithms.dynamicProgramming;

//Solution of the 0-1 Knapsack Problem
public class Knapsack0_1 {
    static int[] value = { 1, 2, 5, 8, 7 };
    static int[] weight = { 1, 3, 4, 5, 10 };
    static int weight_Knapsack = 8;
    static int weightlen = weight.length - 1;
    static int valuelen = value.length - 1;

    public static void main(String[] args) {
        int dp[][] = new int[weightlen + 1][weight_Knapsack + 1];
        for (int i = 0; i <= weightlen; i++) {
            for (int j = 0; j <= weight_Knapsack; j++) {
                dp[i][j] = -1;
            }
        }
        int max_profit_recursive = knapsack(value,weight,weight_Knapsack,weightlen);
        int max_profit_dp1 = knapsackmemo(value, weight, weight_Knapsack, weightlen, dp);
        int max_profit_dp2 = knapsack(weight_Knapsack,weight,value, weightlen);
        System.out.println(" Max Profit : " + max_profit_recursive);
        System.out.println(" Max Profit : " + max_profit_dp1);
        System.out.println(" Max Profit : " + max_profit_dp2);
    }


    //1. Recursive Approach
    private static int knapsack(int[] value, int[] weight, int weight_Knapsack, int weightlen) {
        int profit = 0;
        if (weight_Knapsack == 0 || weightlen == 0) {
            return 0;
        }
        if (weight[weightlen] > weight_Knapsack) {
            return knapsack(value, weight, weight_Knapsack, weightlen - 1); // Not picking that item
        } else if (weight[weightlen] <= weight_Knapsack) {
            profit = Math.max(
                    value[weightlen] + knapsack(value, weight, weight_Knapsack - weight[weightlen], weightlen - 1), //Picking the element
                    knapsack(value, weight, weight_Knapsack, weightlen - 1)); // Not picking the element in the knapsack
        }
        return profit;
    }


    //2. Dynamic Programing (Memoization)
    private static int knapsackmemo(int[] value, int[] weight, int weight_Knapsack, int weightlen, int dp[][]) {
        if (weight_Knapsack == 0 || weightlen == 0) {
            return 0;
        }
        if (dp[weightlen][weight_Knapsack] != -1) {
            return dp[weightlen][weight_Knapsack];
        }
        if (weight[weightlen] > weight_Knapsack) {
            return dp[weightlen][weight_Knapsack] = knapsack(value, weight, weight_Knapsack, weightlen - 1); //Not picking
        } else if (weight[weightlen] <= weight_Knapsack) {
            return dp[weightlen][weight_Knapsack] = Math.max(
                    value[weightlen] + knapsack(value, weight, weight_Knapsack - weight[weightlen], weightlen - 1), //Picking element
                    knapsack(value, weight, weight_Knapsack, weightlen - 1)); // Not picking the element in the knapsack
        }
        return 0;
    }

    
    //3. Dynamic Programming (Tabulation)
    static int knapsack(int W, int wt[], int val[], int n) 
    { 
         int i, w;
        int K[][] = new int[n + 1][W + 1];
  
        // Build table K[][] in bottom up manner
        for (i = 0; i <= n; i++) 
        {
            for (w = 0; w <= W; w++) 
            {
                if (i == 0 || w == 0)
                    K[i][w] = 0;
                else if (wt[i - 1] <= w)
                    K[i][w]
                        = Math.max(val[i - 1]
                         + K[i - 1][w - wt[i - 1]],
                         K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }
        return K[n][W];
    } 
}
