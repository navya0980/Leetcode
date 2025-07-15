class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str=new StringBuilder();
        
        int count=0;
        char[] ch=s.toCharArray();
        for(char c:ch){
            if(c=='('){
                if(count>0){
                    str.append(c);

                }
                count++;
            }
            if(c==')'){
                count--;
                if(count>0){
                    str.append(c);
                }
            }
        }
        return str.toString();
    }
}