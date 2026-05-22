class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum==k){
              c++;
            }
            int rem=sum-k;
            if(map.containsKey(rem)){
                int val=map.get(rem);
                c=c+val;
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return c;
    }
}