class Solution {
    public String removeOuterParentheses(String s) {
       String ans="";
        int c=0;
        int first=1;
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)=='('){
                c++;
            }else if(s.charAt(i)==')'){
                c--;
            }
            if(c==0){
               ans+=s.substring(first,i);
               
                first=i+2;
            }
        }
        return ans;
    }
}