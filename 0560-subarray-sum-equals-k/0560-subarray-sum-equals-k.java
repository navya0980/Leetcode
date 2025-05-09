class Solution {
    public int subarraySum(int[] nums, int k) {
        int c=0;
        int preSum=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            preSum+=nums[i];
            int rem=preSum-k;
            int val=map.getOrDefault(rem,0);
            c+=val;
            int cnt=map.getOrDefault(preSum,0);
            map.put(preSum,++cnt);
        }
        return c;
        
    }
}