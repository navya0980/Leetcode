class Solution {
    public int reverse(int x) {
        int n=Math.abs(x);
        int result=0;
        while(n>0){
            int rem=n%10;
            if(result>(Integer.MAX_VALUE-rem)/10)
             return 0;
            result=result*10+rem;
            n=n/10;
        }
        if(x>0)
        return result;
        else
         return -1*result; 
    }
}