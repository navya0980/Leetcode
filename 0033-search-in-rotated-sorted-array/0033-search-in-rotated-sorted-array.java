class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int peak=findPeak(nums,start,end);
        if(peak==-1){
          return  bs(nums,start,end,target);
        }
        if(target>=nums[0]){
            return bs(nums,start,peak,target);
        }else{
             return bs(nums,peak+1,end,target);
        }
    }
    public static int findPeak(int[] nums,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>=nums[0]){
                if(mid<nums.length-1&&nums[mid]>nums[mid+1]){
                      return mid;
                }else{
                  start=mid+1;
                }
                
            }else {
                end=mid-1;
            }
        }
        return -1;
    }
    public static int bs(int[] nums,int start,int end,int target){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}