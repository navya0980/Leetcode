class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
        int hash1[]=new int[256];
        int hash2[]=new int[256];
        int count=1;
        for(int i=0;i<t.length();i++){
            int n1=hash1[s.charAt(i)];
            int n2=hash2[t.charAt(i)];
            if(n1==n2){
               hash1[s.charAt(i)]=count;
                hash2[t.charAt(i)]=count;
            }else{
                return false;
            }
            count++;
        }
        return true;
    }
}