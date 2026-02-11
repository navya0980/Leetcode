class Solution {
    public double myPow(double x, int n) {
        double num=1;
        if(n==Integer.MIN_VALUE&&x!=1&&x!=-1){
            return 0;
        }
        double ans= getPow(x,num,Math.abs(n));
        if(n<0){
            return 1/ans;
        }
        return ans;
    }
    static double getPow(double x,double num,int n){
        if(n<=0){
            return num;
        }
        if(n%2==1){
            num=num*x;
            n--;
        }else{
            x=x*x;
            n/=2;
        }
        return getPow(x,num,n);
    }
}