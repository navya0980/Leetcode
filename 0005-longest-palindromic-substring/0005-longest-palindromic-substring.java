class Solution {
    public String longestPalindrome(String s) {
        int max=0;
        int maxStart=-1,maxEnd=-1;
        for(int i=0;i<s.length();i++){
                 int start=i,end=i;
                 while(start>=0&&end<s.length()&&s.charAt(start)==s.charAt(end)){
                    int len=end-start+1;
                    if(len>max){
                        max=len;
                        maxStart=start;
                        maxEnd=end;
                    }
                    start--;end++;
                 }
                 start=i;end=i+1;
                 while(start>=0&&end<s.length()&&s.charAt(start)==s.charAt(end)){
                    int len=end-start+1;
                    if(len>max){
                        max=len;
                        maxStart=start;
                        maxEnd=end;
                    }
                    start--;end++;
                 }
        }
        return s.substring(maxStart,maxEnd+1);
    }
}