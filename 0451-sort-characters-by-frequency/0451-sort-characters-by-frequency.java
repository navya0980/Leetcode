class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer>map=new HashMap<>();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            int val=map.getOrDefault(s.charAt(i),0);
            map.put(s.charAt(i),++val);
        }
        Map<Character, Integer> sortedMap = map.entrySet()
            .stream()
            .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed()).collect(Collectors.toMap(
        Map.Entry::getKey,
        Map.Entry::getValue,
        (e1, e2) -> e2,
        LinkedHashMap::new
    )); ;
            for(Map.Entry<Character,Integer>mp: sortedMap.entrySet()){
              int n=mp.getValue();
              while(n!=0){
                ans.append(mp.getKey());
                n--;
              }
            }
           
return ans.toString();
    }
}