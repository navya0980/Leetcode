class Solution {
    public int search(int[] nums, int target) {
      if(nums.length==0)
      return -1;
     
         int start=0;
        int end=nums.length-1;
         if(nums[start]==target)
         return start;
         else if(nums.length==1)
          return -1;
        if(nums[start]<nums[end]){
            return binarySearch(nums,target,start,end);
        }
       int ans=findElement(nums,target);
      
       if(ans!=-1){ 
        if(nums[ans]==target)
            return ans;
           else if(target<=nums[ans]&&target>=nums[start]){
           return binarySearch(nums,target,start,ans);
        }else{
           return binarySearch(nums,target,ans+1,end);
        }
       }
       return -1;
        
    }

static int findElement(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>nums[mid+1])
            return mid;
            else if(nums[mid]>=nums[nums.length-1]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    static int binarySearch(int[] nums,int target,int start,int end){
       
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

       
             
            

        
    