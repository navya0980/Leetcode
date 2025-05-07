class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
           int val=map.getOrDefault(nums[i],0);
           map.put(nums[i],++val);
        }
        for(Map.Entry<Integer,Integer> it:map.entrySet()){
            if(it.getValue()==1){
                return it.getKey();
            }
        }
        return -1;
    }
}