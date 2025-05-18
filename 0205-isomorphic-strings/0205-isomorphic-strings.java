class Solution {
    public boolean isIsomorphic(String s, String t) {

       Map<Character,Character>mp=new HashMap<>();
       if(s.length()!=t.length())
        return false;
       for(int i=0;i<s.length();i++){
        if(!mp.containsKey(s.charAt(i))){
            if(!mp.containsValue(t.charAt(i))){
                mp.put(s.charAt(i),t.charAt(i));
            }else{
                return false;
            }
        }else{
            if(mp.get(s.charAt(i))==t.charAt(i)){
                continue;
            }else{
                return false;
            }
        }
       }
       return true;

    }
}