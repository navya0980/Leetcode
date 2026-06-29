class Solution {
    public void moveZeroes(int[] nums) {
         int i=0;
         while(i<nums.length&&nums[i]!=0)  {
            i++;
         }
         int j=i+1;
         while(j<nums.length){
            while(j<nums.length&&nums[j]==0){
                j++;
            }
            if(j<nums.length){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
            }
         }
    }
}