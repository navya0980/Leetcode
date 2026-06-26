class Solution {
    public int reverse(int x) {
        int n=Math.abs(x);
        int num=0;
        while(n>0){
            int rem=n%10;
            if(num>((Integer.MAX_VALUE-rem)/10)){
                return 0;
            }
            num=num*10+rem;
            n=n/10;

        }
        return (x<0)?-1*num:num;
    }
}