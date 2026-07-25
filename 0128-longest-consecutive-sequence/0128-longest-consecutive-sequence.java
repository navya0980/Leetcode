class Solution {
    public int longestConsecutive(int[] nums) {
       Map<Integer,Integer> map=new HashMap<>();
       int maxLen=0;
       for(int i=0;i<nums.length;i++){
        map.put(nums[i],i);
       } 
       for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        if(!map.containsKey(entry.getKey()-1)){
            int n=entry.getKey();
            int c=1;
            while(map.containsKey(n+1)){
                n++;
                c++;
            }
            maxLen=Math.max(maxLen,c);
        }
    
     }
     return maxLen;
    }
}