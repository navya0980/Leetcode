class Solution {
    public int maxSubArray(int[] nums) {
       int sum=0;
       int max=Integer.MIN_VALUE;
       for(int n:nums){
        if(sum<0){
            sum=0;
        }
        sum+=n;
        max=Math.max(sum,max);
       } 
       return max;
    }
}