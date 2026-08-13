class Solution {
    public int singleNonDuplicate(int[] nums) {
        int s=0,e=nums.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            
            if(m>0&&nums[m]==nums[m-1]){
              
              if(m%2!=0){
                s=m+1;
              }else{
                e=m-2;
              }
            }else if(m<e&&nums[m]==nums[m+1]){
                if(m%2!=0){
               e=m-1;
              }else{
                s=m+2;
              }
            }else{
                return nums[m];
            }
        }
        return -1;
    }
}