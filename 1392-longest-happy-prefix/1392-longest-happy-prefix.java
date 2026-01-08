class Solution {
    public String longestPrefix(String s) {
       int[] lps=new int[s.length()];
        int prefix=0,suffix=1;
        while(suffix<s.length()){
            if(s.charAt(prefix)!=s.charAt(suffix)){
                if(prefix!=0){
                    prefix=lps[prefix-1];
                }else{
                    lps[suffix]=0;
                    suffix++;
                }
            }else{
                lps[suffix]=prefix+1;
                suffix++;prefix++;
            }
        }
        return s.substring(0,lps[lps.length-1]);

    }
}