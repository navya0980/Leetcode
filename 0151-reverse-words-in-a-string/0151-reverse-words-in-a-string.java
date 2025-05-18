class Solution {
    public String reverseWords(String s) {
       s=s.replaceAll("\\s{2,}"," ").trim();
       String[] m=s.split(" ");
      StringBuilder ans=new StringBuilder();
       for(int i=m.length-1;i>0;i--){
        ans.append(m[i]+" ");
       }
       ans.append(m[0]);
       return ans.toString();
       
        
    }
}