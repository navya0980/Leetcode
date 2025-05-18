class Solution {
    public String reverseWords(String s) {
        s=s.replaceAll("\\s{2,}"," ").trim();
        int start=0;
        int end=s.length();
        StringBuilder ans=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                String temp=s.substring(i+1,end);
                ans.append(temp+" ");
                end=i;
            }
        }
        ans.append(s.substring(start,end));
        return ans.toString();
        
    }
}