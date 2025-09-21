class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                n++;
                max=Math.max(max,n);
            }else{
                n=0;
            }

        }
        return max;
        
    }
}