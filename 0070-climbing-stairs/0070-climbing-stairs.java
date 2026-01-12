class Solution {
    public int climbStairs(int n) {
         int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        // Base cases
        dp[0] = 1;
        dp[1] = 1;

        // Fill dp array using bottom-up dynamic programming
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}