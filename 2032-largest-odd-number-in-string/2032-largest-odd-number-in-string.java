class Solution {
    public String largestOddNumber(String num) {
        char[] ch=num.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            int n=Integer.parseInt(ch[i]+"");
            if(n%2!=0){
                return new String(ch,0,i+1);
            }
        }
        return "";
    }
}