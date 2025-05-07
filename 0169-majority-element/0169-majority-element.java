class Solution {
    public int majorityElement(int[] nums) {
        int m=nums.length/2;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int c=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==num){
                    c++;
                }
            }
            if(c>m){
                return num;
            }
     
        }
        return -1;
    }
}