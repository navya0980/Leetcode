class Solution {
    public boolean isPalindrome(String s) {
       s=s.toLowerCase();
      int i=0;
      int j=s.length()-1;
      while(i<j){
         if(!isalnum(s.charAt(i))){i++;continue;}
         if(!isalnum(s.charAt(j))){j--;continue;}
         if(s.charAt(i)!=s.charAt(j)){
            return false;
         }else{
            i++;
            j--;
         }

      }
       return true; 
    }
    public static boolean isalnum(char ch){
        if((ch>='a'&&ch<='z')||(ch<='9'&&ch>='0')) return true;
        else return false;
    }
}