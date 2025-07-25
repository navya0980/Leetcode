class Solution {
    public int beautySum(String s) {
        int sum=0;
        char ch[]=s.toCharArray();

        for(int i=0;i<ch.length;i++){
           Map<Character,Integer>map=new HashMap<>();
            for(int j=i;j<ch.length;j++){
                char c=ch[j];
                int val=map.getOrDefault(c,0);
                
            map.put(c,++val);

            Integer max=Collections.max(map.values());
            Integer min=Collections.min(map.values());
             
            

            sum+=(int)(max-min);
            
            }
           
        }
        return sum;
    }
}