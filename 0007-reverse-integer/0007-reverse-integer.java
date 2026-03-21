class Solution {
    public int reverse(int x) {
        int num=Math.abs(x);
        int rev=0;
        while(num>0){
        if(rev>(Integer.MAX_VALUE-(num%10))/10){
            return 0;
        }
          rev=rev*10+num%10;
          num=num/10;
        }
        return (x<0)?rev*-1:rev;
    }
}