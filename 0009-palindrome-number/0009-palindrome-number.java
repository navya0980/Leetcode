class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
         return false;
        int n=x;
        int a=0;

        while(x>0){
            int rem=x%10;
            a=a*10+rem;
            x=x/10;
        }
        if(a==n)
         return true;
         else return false;
        
    }
}