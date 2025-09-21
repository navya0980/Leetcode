class Solution {
    public int removeDuplicates(int[] nums) {
       int i=0;
       int j=0;
       while(i<nums.length&&j<nums.length){
        while(j<nums.length&&nums[j]==nums[i])j++;
       if(i<nums.length-1&&j<nums.length){
         nums[i+1]=nums[j];
        i++;
       }
       }
       return i+1;

    }
}