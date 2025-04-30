class Solution {
    public int majorityElement(int[] nums) {
        int el=0;
        int c=0;
        int i=0;
        while(i<nums.length){
            if(c==0){
                el=nums[i];
                c=1;
            }else if(nums[i]==el){
                c++;
            }
            else{
                c--;
            }
            i++;
        }
        return el;
    }
}