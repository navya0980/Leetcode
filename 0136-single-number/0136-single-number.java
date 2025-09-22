class Solution {
    public int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int counter=0;

            for(int j=0;j<nums.length;j++){
                if(nums[j]==n){
                    counter++;
                }
            }
            if(counter==1){
                return n;
            }
        }
        return -1;
    }
}