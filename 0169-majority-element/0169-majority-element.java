class Solution {
    public int majorityElement(int[] nums) {
       int n=nums.length/2;
       Map<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        int value=map.getOrDefault(nums[i],0);
        if(value+1>n){
            return nums[i];
        }
        map.put(nums[i],++value);
       }
       return -1;
    }
}