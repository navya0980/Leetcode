class Solution {
    static int mod=1000000007;
    public int countGoodNumbers(long n) {
        long odd=n/2;
        long even=(n+1)/2;
        long part1=power(5,even);
        long part2=power(4,odd);

        return (int)((part1*part2)%mod);
    }
    static long power(long base,long exp){
        long result=1;
        base=base%mod;
        
        while(exp>0){
            if(exp%2==1){
                result=(result*base)%mod;
            }
            base=(base*base)%mod;
            exp/=2;
        }
        return result;
    }
}