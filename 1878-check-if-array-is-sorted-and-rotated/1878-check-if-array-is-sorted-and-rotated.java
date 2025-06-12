class Solution {
    public boolean check(int[] nums) {
        int sorted=0;
        int rotated=0;
        for(int i=0;i<nums.length-1;i++){
           if(nums[i]>nums[i+1]){
            rotated++;
           }
           if(rotated==2){
            return false;
           }
            
        }
        if(rotated==1){
            if(nums[0]<nums[nums.length-1]){
                return false;
            }
            else{
                return true;
            }
        }
        return rotated==0;
       
    }
}