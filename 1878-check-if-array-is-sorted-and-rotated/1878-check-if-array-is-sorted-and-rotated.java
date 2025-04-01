class Solution {
    public boolean check(int[] nums) {
        int r=0;
        int i=0;
       while(i<nums.length-1&&r<2){
            if(nums[i]<=nums[i+1]){

            }
            else
              r++;
              
            i++;
        }
        if(r==1&&nums[0]<nums[nums.length-1]||r>=2){
            return false;
        }else
        return true;
      
    }
}