class Solution {
    public int subarraySum(int[] nums, int k) {
       int c=0;
       Map<Integer,Integer> map=new HashMap<>();
       map.put(0,1);
       int sum=0;
       for(int i=0;i<nums.length;i++){
          sum+=nums[i];
          int n=sum-k;
          if(map.containsKey(n)){
            c+=map.get(n);

          }
          int val=map.getOrDefault(sum,0);
          map.put(sum,++val);
       } 
       return c;
    }
}