class Solution {
    public int removeDuplicates(int[] nums) {
        int j=2;
        int i=2;
        while(i<nums.length){
            if(nums[i]!=nums[j-2]){
               int temp=nums[j];
               nums[j]=nums[i];
               nums[i]=temp;
               j++;
            }
            i++;
        }
        return j;

        
    }
}