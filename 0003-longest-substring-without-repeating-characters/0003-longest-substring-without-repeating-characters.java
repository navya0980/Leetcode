class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            StringBuilder str=new StringBuilder("");
            int len=0;
            for(int j=i;j<s.length();j++){
                Character ch=s.charAt(j);
                if(str.indexOf(ch.toString())!=-1){
                  
                  break;
                }
                str.append(ch);
                len=j-i+1;
                max=Math.max(len,max);

            }

        }
        return max;
    }
}