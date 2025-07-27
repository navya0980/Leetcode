class Solution {
    public String longestPalindrome(String s) {
      int maxStart=0;
      int maxEnd=0;
      char ch[]=s.toCharArray();
      for(int i=0;i<ch.length;i++){
        for(int j=i;j<ch.length;j++){
            if(checkPalindrome(ch,i,j)){
                if((j-i)>(maxEnd-maxStart)){
                    maxStart=i;
                    maxEnd=j;
                }
            }
        }
      } 
      return s.substring(maxStart,maxEnd+1);
    }
    public static boolean checkPalindrome(char[] arr,int start,int end){
        while(start<=end){
            if(arr[start]!=arr[end])
             return false;
            start++;
            end--;
        }
        return true;
    }
}