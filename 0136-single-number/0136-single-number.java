class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int val=mp.getOrDefault(nums[i],0);
            mp.put(nums[i],++val);
        }
        for(Map.Entry<Integer,Integer> it:mp.entrySet()){
            if(it.getValue()==1){
                return it.getKey();
            }
        }
        return -1;
    }
}