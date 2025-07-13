class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>>map=new HashMap<>();
       for(String s:strs){
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        
           map.computeIfAbsent(new String(ch), k -> new ArrayList<>()).add(s);
        
       } 
       List<List<String>> ans=new ArrayList(map.values());
       return ans;
    }
}