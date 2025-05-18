class Solution {
    public String reverseWords(String s) {
       s=s.replaceAll("\\s{2,}"," ").trim();
       String[] m=s.split(" ");
       String ans="";
       for(int i=m.length-1;i>=0;i--){
        ans+=m[i]+" ";
       }
       return ans.trim();
       
        
    }
}