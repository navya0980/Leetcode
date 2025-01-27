class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int arr[]={-1,-1};
       
        if(nums.length==0){
            return arr;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>target)
            end=mid-1;
            else if(nums[mid]<target)
            start=mid+1;
            else if(nums[mid]==target){
                  arr[0]=mid;
              end=mid-1;
            }
             
        }
       
        int start2=0;
        int end2=nums.length-1;
         while(start2<=end2){
            int mid=start2+(end2-start2)/2;
            if(nums[mid]<target)
            start2=mid+1;
            else if(nums[mid]>target)
           
             end2=mid-1;
             else if(nums[mid]==target){
                  arr[1]=mid;
              start2=mid+1;
             }
              
        }
       
        return arr;
        
    }
}