class Solution {
    public String longestCommonPrefix(String[] strs) {
       String prefix=strs[0];
       
        for(String s:strs){
           int i=0;
           for(;i<Math.min(prefix.length(),s.length());i++){
            if(prefix.charAt(i)!=s.charAt(i))
              break;
           
           }
           prefix=s.substring(0,i);
        }
        return prefix;
    }
}