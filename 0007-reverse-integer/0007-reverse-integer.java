class Solution {
    public int reverse(int x) {
       int n=Math.abs(x);
       int ans=0;
       while(n>0){
        int rem=n%10;
        if(ans>(Integer.MAX_VALUE-rem)/10){
            return 0;
        }
        ans=ans*10+rem;
        n=n/10;
       } 
       return (x<0)?ans*-1:ans;
    }
}