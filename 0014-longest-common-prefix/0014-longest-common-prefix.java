class Solution {
    public String longestCommonPrefix(String[] strs) {
       String prefix=strs[0];
       
        for(String s:strs){
            StringBuilder str=new StringBuilder();
           for(int i=0;i<Math.min(prefix.length(),s.length());i++){
            if(prefix.charAt(i)!=s.charAt(i))
              break;
            str.append(s.charAt(i));
           }
           prefix=str.toString();
        }
        return prefix;
    }
}