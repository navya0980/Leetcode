class Solution {
    public String removeOuterParentheses(String s) {
        int start=1;
        int count=0;
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                count++;
            }else{
                count--;
            }
            if(count==0){
              str.append(s.substring(start,i));
              start=i+2;
            }
        }
        return str.toString();
    }
}