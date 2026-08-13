class Solution {
    public int search(int[] nums, int target) {
        int pivot=findPivot(nums);
        if(pivot==-1){
            return bs(nums,target,0,nums.length-1);
        }
        if(target>=nums[0]){
            return bs(nums,target,0,pivot);
        }
        return bs(nums,target,pivot+1,nums.length-1);

    }
    static int findPivot(int[] nums){
        int s=0,e=nums.length-1;
        while(s<e){
            int m=s+(e-s+1)/2;
            if(nums[m]>nums[0]){
                s=m;
            }else{
                e=m-1;
            }
        }
        return e;
    }
    static int bs(int[] nums,int target,int s,int e){
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m]==target){
                return m;
            }else if(nums[m]<target){
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return -1;
    }
}