class Solution {
    public String longestPalindrome(String s) {
       
        StringBuilder str=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                 
                  if(checkPalindrome(s,i,j)){
                   StringBuilder temp=new StringBuilder(s.substring(i,j+1)); 
                   
                    if(temp.length()>str.length()){
                           str=temp;
                    }
                  }
            }
        }
        return str.toString();
    }
    public static boolean checkPalindrome(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
         return true;
    }
}