class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix=strs[0];
        for(String s:strs){
            int i=0;
            for(i=0;i<Math.min(s.length(),prefix.length());i++){
                if(prefix.charAt(i)!=s.charAt(i)){
                    prefix=s.substring(0,i);
                    break;
                }
                 
              
               
            }
            prefix=s.substring(0,i);
            
        }
        return prefix;
    }
}