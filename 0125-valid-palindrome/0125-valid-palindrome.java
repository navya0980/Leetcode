class Solution {
    public boolean isPalindrome(String str) {
        String s=str.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        if(s.length()==0)
        return true;
        
        for(int i=0;i<(s.length()/2);i++)
         {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
            return false;
         }

       return true; 
    }
}