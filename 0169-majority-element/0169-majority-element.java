class Solution {
    public int majorityElement(int[] nums) {
        int m=nums.length/2;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int val=map.getOrDefault(nums[i],0);
            map.put(nums[i],++val);
        }
        for(Map.Entry<Integer,Integer> it:map.entrySet()){
            if(it.getValue()>m){
                return it.getKey();
            }
        }
        return -1;
    }
}