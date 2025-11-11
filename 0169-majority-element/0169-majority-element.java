class Solution {
    public int majorityElement(int[] nums) {
        //OPTIMAL APPROACH - O(n)
        int counter =0,num=0;
        for(int i=0;i<nums.length;i++){
            if(counter==0){
                num=nums[i];
                counter=1;
                continue;
            }
            if(nums[i]==num){
                counter++;
            }else{
                counter--;
            }
        }
        return num;
    }
}