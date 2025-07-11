class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) 
          return false;
       int[] h1=new int[26];
       int[] h2=new int[26];
       for(int i=0;i<s.length();i++){
        char ch1=s.charAt(i);
        char ch2=t.charAt(i);
        h1[ch1-'a']++;
         h2[ch2-'a']++;
       }
      
       for(int i=0;i<h1.length;i++){
        if(h1[i]!=h2[i]) 
          return false;
       }
       return true;
    }
}