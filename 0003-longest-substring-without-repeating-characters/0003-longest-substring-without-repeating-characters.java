class Solution {
    public int lengthOfLongestSubstring(String s) {
      StringBuilder sb=new StringBuilder("");
      int max=0;
      int c=0;
      for(int i=0;i<s.length();i++){
        Character ch=s.charAt(i);
        if(sb.indexOf(ch.toString())==-1){
            sb.append(ch.toString());
            c++;

        }else{
           while(sb.indexOf(ch.toString())!=-1){
            sb.deleteCharAt(0);
            c--;
           }
           sb.append(ch.toString());
           c++;
        }
        max=Math.max(c,max);
      } 
      return max; 
    }
}