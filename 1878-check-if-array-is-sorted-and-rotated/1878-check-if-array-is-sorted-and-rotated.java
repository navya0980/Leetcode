class Solution {
    public boolean check(int[] nums) {
        if(nums.length==0)return true;
        int rotated=0;
        for(int i=0;i<nums.length;i++){
            if(i<nums.length-1&&nums[i]>nums[i+1]){
              rotated++;
            }
        }
        if(rotated==0||(rotated==1&&nums[0]>=nums[nums.length-1]))
         return true;
        else 
        return false;
        
    }
}