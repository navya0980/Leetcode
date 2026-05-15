class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int maxLen=0;
        for(int i=0;i<nums.length;i++){
           sum+=nums[i];
           if(sum==k){
            maxLen++;
           }
           int rem=sum-k;
           if(map.containsKey(rem)){
            maxLen+=map.get(rem);
           }
           int freq=map.getOrDefault(sum,0);
           map.put(sum,++freq);
           
        }
        return maxLen;
    }
}