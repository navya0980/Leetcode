class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,a=0;
        for(int n:nums){
            if(n==1){
                a++;
            }else{
                max=Math.max(a,max);
                a=0;
            }
        }
        max=Math.max(a,max);
        return max;
        
    }
}