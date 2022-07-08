package javaDSA.otherAlgorithms.dynamicProgramming;

import java.util.Arrays;

public class RodCutting {
    public static void main(String[] args) {
        int length = 8;
        int[] price = { 1, 5, 8, 9, 10, 17, 17, 20 };
        int plen = price.length - 1;
        int profit = maximumRodProfit(length, price, plen);
        int memo = getMaxProfit(price, length);
        System.out.println(profit); // 22
        System.out.println(memo);  //22
    }

    // Recursion
    private static int maximumRodProfit(int length, int[] price, int index) {
        if (index == 0)
            return length * price[0];

        int notTake = 0 + maximumRodProfit(length, price, index - 1);
        int take = Integer.MIN_VALUE;
        int rodLength = index + 1;

        if (rodLength <= length) {
            take = price[index] + maximumRodProfit(length - rodLength, price, index - 1);
        }
        return Math.max(take, notTake);
    }

    // Memoization
    public static int maximumProfit(int[] prices, int n, int[] dp) {
        if (n == 0) {
          return 0;
        }
        if (dp[n] != -1) {
          return dp[n];
        }
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
          maxProfit = Math.max(maxProfit, prices[i - 1] + maximumProfit(prices, n - i, dp));
        }
        return dp[n] = maxProfit;
      }
      public static int getMaxProfit(int[] a, int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        return maximumProfit(a, n, dp);
      }

}
