class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
       int[] hash1=new int[256];
       int[] hash2=new int[256];
     int index=1;
       for(int i=0;i<s.length();i++){
        char ch1=s.charAt(i);
        char ch2=t.charAt(i);
        if(hash1[ch1]!=hash2[ch2]){
            return false;
        }
        hash1[ch1]=index;
        hash2[ch2]=index;
        index++;


       }
       return true;

    }
}