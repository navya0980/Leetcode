class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp=new HashMap<>();
       
        for(int i=0;i<nums.length;i++){
            int a=target-nums[i];
            if(mp.containsKey(a)){
                return new int[]{mp.get(a),i};
            }
            mp.put(nums[i],i);

        }
        return new int[]{-1,-1};

        
        
    }
}