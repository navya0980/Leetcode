class Solution {
    public boolean isPalindrome(String s) {
      
      int i=0;
      int j=s.length()-1;
      while(i<j){
         if(!isalnum(s.charAt(i))){i++;continue;}
         if(!isalnum(s.charAt(j))){j--;continue;}
         if(toLower(s.charAt(i))!=toLower(s.charAt(j))){
            return false;
         }else{
            i++;
            j--;
         }

      }
       return true; 
    }
    public static boolean isalnum(char ch){
        if((ch>='a'&&ch<='z')||(ch<='9'&&ch>='0')||(ch>='A'&&ch<='Z')) return true;
        else return false;
    }
    public static char toLower(char ch){
       Character s=ch;
        String p=s.toString().toLowerCase();
        return p.charAt(0);
        

    }
}