class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char char1=s.charAt(i);
            char char2=t.charAt(i);
            if(map.containsKey(char1)){
                if(map.get(char1)==char2){
                    continue;
                }else{
                    return false;
                }
            }else if(map.containsValue(char2)&&map.containsKey(char1)==false){
                return false;
            }
            map.put(char1,char2);
        }
        return true;
    }
}