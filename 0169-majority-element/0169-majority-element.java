class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int el=0;
        for(int i=0;i<nums.length;i++){
            if(c==0){
                el=nums[i];
                c=1;

            }else if(nums[i]==el){
                c++;
            }else{
                c--;
            }
        }
        return el;
    }
}