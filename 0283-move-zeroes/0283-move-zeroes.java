class Solution {
    public void moveZeroes(int[] nums) {
        int left=-1;
        int right=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                left=i;
                break;
            }
        }
        if(left==-1){
            return;
        }
        right=left+1;
        while(right<nums.length){
            while(right<nums.length&&nums[right]==0){
                right++;
            }
            if(right<nums.length){
                int temp=nums[right];
                nums[right]=nums[left];
                nums[left]=temp;
                left++;
            }
        }

    }
}