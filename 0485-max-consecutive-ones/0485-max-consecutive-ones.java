class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;
        for(int n:nums){
            if(n==1){
                count++;
            }else{
                count=0;
            }
            max=Math.max(count,max);

        }
       return max; 
    }
}