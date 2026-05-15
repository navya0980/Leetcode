class Solution {
    public int removeDuplicates(int[] nums) {
        int left=0,right=left+1;
        while(right<nums.length){
          while(right<nums.length&&nums[left]==nums[right]){
            right++;
          }
        if(right<nums.length){
            int temp=nums[right];
            nums[right]=nums[left+1];
            nums[left+1]=temp;
             left++;right++;
        }
       

        }
        return left+1;
    }
}