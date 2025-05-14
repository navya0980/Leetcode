class Solution {
    public int majorityElement(int[] nums) {
        int c=1;
        int el=nums[0];
        for(int i=1;i<nums.length;i++){
            if(c==0){
                el=nums[i];
                c=1;
            }else if(el==nums[i]){
                c++;
            }else if(nums[i]!=el){
                c--;
            }
        }
        return el;
    }
}