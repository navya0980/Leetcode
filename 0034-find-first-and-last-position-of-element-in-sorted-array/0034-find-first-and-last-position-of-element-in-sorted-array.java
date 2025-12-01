class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=0,end=nums.length-1;
        int[] arr={-1,-1};
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                arr[0]=mid;arr[1]=mid;
                binarySearch1(nums,start,mid-1,target,arr);
                binarySearch2(nums,mid+1,end,target,arr);
                return arr;

            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return arr;
    }
    public static void binarySearch1(int[] nums,int start,int end,int target,int[] arr){
        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
               arr[0]=mid;end=mid-1;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
    }
     public static void binarySearch2(int[] nums,int start,int end,int target,int[] arr){
        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
               arr[1]=mid;start=mid+1;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
    }
}