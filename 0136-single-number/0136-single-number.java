class Solution {
    public int singleNumber(int[] nums) {
        
        for(int n:nums){
            int count=0;
            for(int k:nums){
                if(k==n){
                    count++;
                }
            }
            if(count==1){
                return n;
            }
        }
        return -1;
    }
}