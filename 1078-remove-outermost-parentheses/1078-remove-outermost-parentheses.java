class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str=new StringBuilder("");
        if(s.length()==0){
            return null;
        }
        int c=0;
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='('){
                if(c>0){
                str.append(ch[i]);
            }
                c++;
            }
            if(ch[i]==')'){
                c--;
                if(c>0){
                     str.append(ch[i]);
                }
            }
            
        }
        return str.toString();
    }
}