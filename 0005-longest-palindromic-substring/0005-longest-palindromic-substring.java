class Solution {
    public String longestPalindrome(String s) {
      int maxStart=0,maxEnd=0;
     
      char ch[]=s.toCharArray();
       int i=0;
      int j=ch.length-1;
      while(i<=j){
        while(j>=0&&ch[i]!=ch[j]){
            j--;
        }
        if(j>=0&&checkPalindrome(ch,i,j)){
            if((j-i)>(maxEnd-maxStart)){
                maxStart=i;
                maxEnd=j;
            }else{
                i++;
                j=ch.length-1;
            }
        }else{
            j--;
        }
      } 
      return s.substring(maxStart,maxEnd+1); 
    }
    public static boolean checkPalindrome(char[] ch,int start,int end){
        while(start<=end){
            if(ch[start]!=ch[end])
             return false;
            start++;
            end--;
        }
        return true;
    }
}