class Solution {
    public String longestPalindrome(String s) {
        char ch[]=s.toCharArray();
        
        int maxEnd=0;
        int maxStart=0;

        for(int i=0;i<ch.length;i++){
            //odd length strings
            int left=i,right=i;
            while(left>=0&&right<ch.length&&ch[left]==ch[right]){
               
                left--;
                right++;
            }
            if(right-left>maxEnd-maxStart){
                maxStart=left+1;
                maxEnd=right;
            }
            left=i;
            right=i+1;
            while(left>=0&&right<ch.length&&ch[left]==ch[right]){
                
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