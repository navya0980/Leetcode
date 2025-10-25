class Solution {
    public void moveZeroes(int[] nums) {
      int j=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            j=i;
            break;
        }
      }
      int k=j;
      while(k<nums.length){
        while(k<nums.length&&nums[k]==0){
            k++;
        }
        if(k<nums.length){
            int temp=nums[j];
            nums[j]=nums[k];
            nums[k]=temp;
            j++;
            k++;
        }
      }
    }
}