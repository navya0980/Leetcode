class Solution {
    public int findDuplicate(int[] nums) {
       int[] hash=new int[nums.length];
        for(int i=0;i<nums.length;i++){
           hash[nums[i]]++;
        }  
        for(int i=1;i<hash.length;i++){
            if(hash[i]>1){
                return i;
            }
        }
        return -1;

    }
}