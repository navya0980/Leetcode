class Solution {
    public boolean isAnagram(String s, String t) {
       int[] h1=new int[26];
       int[] h2=new int[26];
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        h1[ch-'a']++;
       }
       for(int i=0;i<t.length();i++){
        char ch=t.charAt(i);
        h2[ch-'a']++;
       }
       for(int i=0;i<h1.length;i++){
        if(h1[i]!=h2[i]) 
          return false;
       }
       return true;
    }
}