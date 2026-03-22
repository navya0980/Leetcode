class Solution {
    public boolean isPalindrome(String s) {
       
        return func(s,0,s.length()-1);
       
    }
    static boolean func(String s,int l,int r){
        if(l>r){
            return true;
        }
        char ch1=s.charAt(l),ch2=s.charAt(r);
        if(!Character.isLetterOrDigit(ch1)){
               return func(s,++l,r);
            }else if(!Character.isLetterOrDigit(ch2)){
             return  func(s,l,--r);
            }else if(Character.toLowerCase(ch1)!=Character.toLowerCase(ch2)){
                return false;
            }
              return func(s,++l,--r);
            
    }
}