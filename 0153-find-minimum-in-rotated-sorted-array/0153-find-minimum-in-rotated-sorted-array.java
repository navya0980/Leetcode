class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        if(nums[low]<nums[high]||nums.length==1){
           return nums[low];
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid<high&&nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            if(mid>low&&nums[mid]<nums[mid-1]){
                return nums[mid];
            }
            if(nums[mid]>nums[low]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
       return -1;
        
    }
}