class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder str=new StringBuilder("");
        int c=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            Character ch=s.charAt(i);
            if(str.indexOf(ch.toString())==-1){
                str.append(ch);
                c++;
            }else{
                while(str.indexOf(ch.toString())!=-1){
                    str.deleteCharAt(0);
                    c--;
                }
                str.append(ch);
                c++;
            }
            max=Math.max(c,max);
        }
        return max;
    }
}