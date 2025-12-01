class Solution {
    public int findMin(int[] nums) {
       int start=0;
       int end=nums.length-1;
       int peak=-1;
       while(start<=end){
        int mid=start+(end-start)/2;
        if(mid<end&&nums[mid]>nums[mid+1]){
            peak=mid;
            break;
        }
        if(mid>start&&nums[mid]<nums[mid-1]){
            peak=mid-1;
            break;
        }
        if(nums[mid]>=nums[start]){
           start=mid+1;
        }else{
            end=mid-1;
        }

       } 
       return nums[peak+1];
    }
}