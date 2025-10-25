class Solution {
    public int removeDuplicates(int[] nums) {
        int i=2,j=i;
        while(j<nums.length){
            while(j<nums.length&&nums[j]==nums[i-2]){
               j++;
            }
           if(j<nums.length){
           nums[i]=nums[j];
           i++;
           j++;
           
           }
        }
        return i;
    }
}