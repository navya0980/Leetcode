class Solution {
    public boolean search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int peak=pivot(nums,start,end);
        if(peak==-1){
          return  bs(nums,start,end,target);
        }
        if(target>=nums[0]){
            return bs(nums,start,peak,target);
        }else{
             return bs(nums,peak+1,end,target);
        }

        
       
    }
    public static int pivot(int[] nums,int s,int e){
        while(s<=e){
            int m=s+(e-s)/2;
            if(m<e&&nums[m]>nums[m+1]){
                return m;
            }
            if(m>s&&nums[m]<nums[m-1]){
                return m-1;
            }
            //check if start,end and middle are duplicates and skip
            if(nums[m]==nums[s]&&nums[m]==nums[e]){
                //check if start is pivot
                if(s<e&&nums[s]>nums[s+1])
                   return s;
                //skip start
                s++;
                //check if end is pivot
                if(e>s && nums[e]<nums[e-1])
                 return e-1;
                //skip end
                e--;
            }
            else if(nums[m]>=nums[s]){
                s=m+1;
            }else {
                e=m-1;
            }
            
        }
        return -1;
    }
     public static boolean bs(int[] nums,int start,int end,int target){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return true;
            }else if(nums[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return false;
    }
}