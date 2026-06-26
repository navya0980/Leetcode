class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int n=x;
        int res=0;
        while(n>0){
            res=res*10+(n%10);
            n=n/10;
        }
        return res==x;
    }
}