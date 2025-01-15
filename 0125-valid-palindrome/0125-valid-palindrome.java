class Solution {
    public boolean isPalindrome(String str) {
    str=str.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        if(str==null)
        return true;
        
        for(int i=0;i<(str.length()/2);i++)
         {
            if(str.charAt(i)!=str.charAt(str.length()-1-i))
            return false;
         }

       return true; 
    }
}