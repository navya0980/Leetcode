class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(mid>low&&nums[mid]==nums[mid-1]){
                if((mid+1)%2!=0){
                    high=mid-2;
               
                }
                else{
                    
                    low=mid+1;
                }
            }else if(mid<high&&nums[mid]==nums[mid+1]){
                if((high-mid+1)%2!=0){
                    low=mid+2;
                }else{
                    high=mid-1;
                }
            }else{
                return nums[mid];
            }
        }
        return nums[low];
    }
}