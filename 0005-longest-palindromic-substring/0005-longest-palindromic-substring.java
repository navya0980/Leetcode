class Solution {
    public String longestPalindrome(String s) {
        char ch[]=s.toCharArray();
        StringBuilder str=new StringBuilder("");
        for(int i=0;i<ch.length;i++){
            for(int j=i;j<ch.length;j++){
                 
                  if(checkPalindrome(ch,i,j)){
                   StringBuilder temp=new StringBuilder(s.substring(i,j+1)); 
                   
                    if(temp.length()>str.length()){
                           str=temp;
                    }
                  }
            }
        }
        return str.toString();
    }
    public static boolean checkPalindrome(char[] arr,int start,int end){
        while(start<=end){
            if(arr[start]!=arr[end]){
                return false;
            }
            start++;
            end--;
        }
         return true;
    }
}