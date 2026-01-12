class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
       return fun(nums,nums.length-1,dp); 
    }
    static int fun(int[] nums,int n,int[] dp){
        if(n==0)return nums[n];
        if(n<0) return 0;
        if(dp[n]!=-1)return dp[n];
        int pick=nums[n]+fun(nums,n-2,dp);
        int notpick=fun(nums,n-1,dp);
        return dp[n]=Math.max(pick,notpick);

    }
}