class Solution {
    public String reverseWords(String s) {
        s=s.replaceAll("\\s+", " ").trim();
        StringBuilder ans=new StringBuilder();
        int lastIndex=s.length();
        int i=0;
        for( i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                ans.append(s.substring(i+1,lastIndex)+" ");
                lastIndex=i;

            }
        }
         ans.append(s.substring(i+1,lastIndex));

       return ans.toString(); 
    }
}