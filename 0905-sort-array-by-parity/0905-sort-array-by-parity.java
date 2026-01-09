class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0,j=0;
        while(j<nums.length&&i<nums.length){
            while(j<nums.length&&nums[j]%2!=0){
                j++;
            }
           if(j<nums.length){
             int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
           }
            i++;j++;
        }
        return nums;
    }
}