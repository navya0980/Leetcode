class Solution {
    public int singleNumber(int[] nums) {
        int x1=0;
        for(int i=0;i<nums.length;i++){
            x1=x1^nums[i];
           
        }
        return x1;
        
    }
}