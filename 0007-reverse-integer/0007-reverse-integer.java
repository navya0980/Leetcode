class Solution {
    public int reverse(int x) {
        int result=0;
        int num=Math.abs(x);
        while(num>0){
            int rem=num%10;
            if(result>(Integer.MAX_VALUE-rem)/10){
                return 0;
            }
            result=result*10+rem;
            num=num/10;

        }
        return (x<0)?result*-1:result;
    }
}