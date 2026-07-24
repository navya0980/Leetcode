class Solution {
    public int majorityElement(int[] nums) {
        int num=0;
        int count=0;
        for(int n:nums){
            if(count==0){
                num=n;
            }
            if(n==num){
                count++;
            }else{
                count--;
            }
        }
        return num;
    }
}