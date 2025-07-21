class Solution {
    public String longestPalindrome(String s) {
       char ch[]=s.toCharArray(); 
       StringBuilder str=new StringBuilder();
       int i=0;
       int j=ch.length-1;
       while(i<=j){
       
        while(j>=0&&ch[j]!=ch[i]){
            j--;
        }
         StringBuilder temp=new StringBuilder(s.substring(i,j+1));
        if(j>=0&&checkPalindrome(ch,i,j)){
                 if(temp.length()>str.length()){
                    str=temp;
                 }
                 i++;
                 j=ch.length-1;
        }else{
            j--;
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