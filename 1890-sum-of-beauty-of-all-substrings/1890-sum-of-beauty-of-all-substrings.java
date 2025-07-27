class Solution {
    public int beautySum(String s) {
      int n=s.length();
      int sum=0;
       for(int i=0;i<n;i++){
        Map<Character,Integer>map=new HashMap<>();
        for(int j=i;j<n;j++){
            char c=s.charAt(j);
            int value=map.getOrDefault(c,0);
            map.put(c,++value);
            Integer max=Collections.max(map.values());
             Integer min=Collections.min(map.values());
            sum+=max-min;
        }
       } 
       return sum;
    }
}