class Solution {
    public String longestPalindrome(String s) {
      int maxStart=0,maxEnd=0;
     
     char ch[]=s.toCharArray();
     int n=ch.length;
     for(int i=0;i<n;i++){
        //for odd length strings
        int start=i,end=i;
        while(start>=0&&end<n&&ch[start]==ch[end]){
            start--;
            end++;
        }
        if(end-start>maxEnd-maxStart){
            maxStart=start+1;
            maxEnd=end;
        }
        //for even length strings
        start=i;
        end=i+1;
        while(start>=0&&end<n&&ch[start]==ch[end]){
            start--;
            end++;
        }
        if(end-start>maxEnd-maxStart){
            maxStart=start+1;
            maxEnd=end;
        }


     }
      return s.substring(maxStart,maxEnd); 
    }
    
}