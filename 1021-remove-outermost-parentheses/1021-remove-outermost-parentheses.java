class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans=new StringBuilder();
        int count=0;
        int left=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
             count++;
            }else{
                count--;
            }
            if(count==0){
                ans.append(s.substring(left+1,i));
                left=i+1;
            }
        }
        return ans.toString();
    }
}