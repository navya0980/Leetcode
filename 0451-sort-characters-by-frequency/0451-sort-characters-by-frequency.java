class Solution {
    public String frequencySort(String s) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            int a=(int)s.charAt(i);
            int val=map.getOrDefault(a,0);
            map.put(a,++val);
        }
       Stream<Map.Entry<Integer,Integer>> sorted =
    map.entrySet().stream()
       .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()));
        
        StringBuilder str=new StringBuilder();
       sorted.forEach(entry->{
         int m=entry.getKey();
         int n=entry.getValue();
         char ch=(char)m;
         while(n!=0){
            str.append(ch);
            n--;
         }
       });

        return str.toString();
    }
}