class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans=new StringBuilder();
        int c=0;
        int first=1;
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)=='('){
                c++;
            }else if(s.charAt(i)==')'){
                c--;
            }
            if(c==0){
                String temp=s.substring(first,i);
                ans.append(temp);
                first=i+2;
            }
        }
        return ans.toString();
    }
}