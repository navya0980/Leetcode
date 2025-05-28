class Solution {
    public int search(int[] nums, int target) {
        
        int start=0;
        int end=nums.length-1;
       return bs(nums,start,end,target);
    }
    public static int bs(int[] nums,int start,int end,int target){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(nums[mid]==target){
            return mid;
        }else if(nums[mid]>target){
            return bs(nums,start,mid-1,target);
           
        }else{
           
            return  bs(nums,mid+1,end,target);
        }
       
    }
}