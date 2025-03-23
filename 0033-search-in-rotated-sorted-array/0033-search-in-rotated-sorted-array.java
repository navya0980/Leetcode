class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==1){
            if(nums[0]==target)
              return 0;
            else
             return -1;
             
        }

        
        int start=0;
        int end=nums.length-1;
        if(nums[start]<nums[end])
          return binarySearch(nums,start,end,target);
        int pivot=findPivot(nums,start,end);
        if(pivot!=-1){
            if(nums[pivot]==target)
              return pivot;
            else if(target>=nums[0]){
              return binarySearch(nums,0,pivot,target);
        }
             
        }
      
        
       
            return binarySearch(nums,pivot+1,nums.length-1,target);
      

        
    }
    static int binarySearch(int[] nums,int start,int end,int target){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target)
            return mid;
            else if(nums[mid]>target)
             end=mid-1;
            else start=mid+1;

        }
        return -1;
    }
    static int findPivot(int[] nums,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1])
             return mid;
            else if(nums[mid]>nums[nums.length-1])
              start=mid+1;
            else end=mid-1;
        }
        return -1;
    }
}