class Solution {
    public int maxDepth(String s) {
        int max=Integer.MIN_VALUE;
        int counter=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
               counter++;
            }else if(ch==')') {
                counter--;
            }
            max=Math.max(max,counter);
        }
        return max;
        
    }
}