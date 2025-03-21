class Solution {
    static boolean check(int i,int n,String s){
    if(i>=n)
      return true;
    if(s.charAt(i)==s.charAt(n-i-1))
      return check(i+1,n,s);
    else return false;
}
    public boolean isPalindrome(String s) {
        String str=s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
         return check(0,str.length(),str);
        
    }
}
