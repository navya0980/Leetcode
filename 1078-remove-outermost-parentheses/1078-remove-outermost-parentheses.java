class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str=new StringBuilder("");
        if(s.length()==0){
            return null;
        }
        int c=0;
        int j=1;
        for(int i=0;i<s.length();i++){

            Character ch=s.charAt(i);
            if(ch=='(')c++;
            if(ch==')')c--;
            if(c==0){
               str.append(s.substring(j,i));
               j=i+2;
            }
        }
        return str.toString();
    }
}