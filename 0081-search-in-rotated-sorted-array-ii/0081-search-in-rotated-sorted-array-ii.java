class Solution {
    public boolean search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
      if(nums.length==0){
        return false;
      }
      if(nums.length==1){
        if(nums[0]==target){
            return true;
        }else{
            return false;
        }
      }
      int peak=findPeak(nums);
     if(peak==-1){
        return  binarySearch(nums,start,end,target);
     }
      if(target==nums[peak]){
        return true;
      }
      if(target>=nums[0]){
       return binarySearch(nums,0,peak,target);
      }
       return binarySearch(nums,peak+1,nums.length-1,target);
      
      
      
    }
    public static boolean binarySearch(int[] nums,int start,int end,int target){
        while(start<=end){
         int mid=start+(end-start)/2;
         if(nums[mid]==target){
            return true;
         }else if(nums[mid]<target){
            start=mid+1;
         }else{
            end=mid-1;
         }
        }
        return false;
    }
    public static int findPeak(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end&&nums[mid]>nums[mid+1]){
                return mid;
            } if(mid>start&&nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[mid]==nums[start]&&nums[mid]==nums[end]){
                if(start<end&&nums[start]>nums[start+1]){
                    return start;
                }
                start++;
                if(start<end&&nums[end]<nums[end-1]){
                    return end-1;
                }
                end--;
            }else 
            if(nums[mid]>=nums[start]&&nums[mid]>nums[end]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
       return -1;
    }
}