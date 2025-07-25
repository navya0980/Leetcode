class Solution {
    public String longestPalindrome(String s) {
       
        int maxEnd=0;
        int maxStart=0;

        for(int i=0;i<s.length();i++){
            //odd length strings
            int left=i,right=i;
            while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
               
                left--;
                right++;
            }
            if(right-left>maxEnd-maxStart){
                maxStart=left+1;
                maxEnd=right;
            }
            left=i;
            right=i+1;
            while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
                
                left--;
                right++;
            }
            if(right-left>maxEnd-maxStart){
                maxStart=left+1;
                maxEnd=right;
            }

        }
        return s.substring(maxStart,maxEnd);
    }

}