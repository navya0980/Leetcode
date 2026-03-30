class Solution {
    public void moveZeroes(int[] nums) {
        int left=0;
        while(left<nums.length&&nums[left]!=0){
           left++;
        }
        int right=left+1;
        while(left<nums.length&&right<nums.length){
            while(right<nums.length&&nums[right]==0){
                right++;
            }
            if(right<nums.length){
                int temp=nums[right];
                nums[right]=nums[left];
                nums[left]=temp;
                left++;right++;
            }
        }
    }
}