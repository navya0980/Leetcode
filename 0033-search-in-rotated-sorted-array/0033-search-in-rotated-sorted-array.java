class Solution {
    public int search(int[] nums, int target) {
      if(nums.length==0){
        return -1;
      }
      if(nums.length==1){
        if(nums[0]==target){
            return 0;
        }else{
            return -1;
        }
      }
      int peak=findPeak(nums);
      
      if(target==nums[peak]){
        return peak;
      }
      if(target>=nums[0]&&target<nums[peak]){
       return binarySearch(nums,0,peak,target);
      }
       return binarySearch(nums,peak+1,nums.length-1,target);
      
      
      
    }
    public static int binarySearch(int[] nums,int start,int end,int target){
        while(start<=end){
         int mid=start+(end-start)/2;
         if(nums[mid]==target){
            return mid;
         }else if(nums[mid]<target){
            start=mid+1;
         }else{
            end=mid-1;
         }
        }
        return -1;
    }
    public static int findPeak(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<nums.length-1&&nums[mid]>nums[mid+1]){
                return mid;
            }else if(mid>0&&nums[mid]<nums[mid-1]){
                return mid-1;
            }
            else if(nums[mid]<=nums[0]){
                end=mid-1;
            }else if(nums[mid]>=nums[0]){
                start=mid+1;
            }
        }
        return nums.length-1;
    }
}