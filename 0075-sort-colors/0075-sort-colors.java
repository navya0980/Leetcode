class Solution {
    public void sortColors(int[] nums) {
       int mid=0;
       int low=0;
        int high=nums.length-1;
        while(mid<=high&&mid<nums.length){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }

        }
        
    }
}