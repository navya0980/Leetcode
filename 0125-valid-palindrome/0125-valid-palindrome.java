class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str=new StringBuilder(s.toLowerCase().replaceAll("[^a-zA-Z0-9]",""));
        for(int i=0;i<str.length()/2;i++){
           char ch1=str.charAt(i);
           char ch2=str.charAt(str.length()-i-1);
           if(ch1!=ch2){
                return false;
           }
        }
        return true;
    }
}