class Solution {
    public String largestOddNumber(String num) {
        String ans="";
        int i=num.length()-1;
        while(i>=0){
            int n=(int)num.charAt(i);
            if(n%2!=0){
                ans=num.substring(0,i+1);
                break;
            }
            i--;
        }
       return ans; 
    }
}