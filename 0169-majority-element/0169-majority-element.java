class Solution {
    public int majorityElement(int[] nums) {
        int len=nums.length/2;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int val=mp.getOrDefault(nums[i],0);
            mp.put(nums[i],++val);
            if(mp.get(nums[i])>len){
                return nums[i];
            }
        }
        return -1;
        
    }
}