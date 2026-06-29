class Solution {
    public int removeDuplicates(int[] nums) {
        int left=0;
        int right=0;
        while(right<nums.length){
             while( right<nums.length &&nums[left]==nums[right]){
                right++;
             }
             if(right<nums.length){
               int temp= nums[left+1];
               nums[left+1]=nums[right];
               nums[right]=temp;
               left++;
               right++;
             }
        }
        return left+1;
    }
}