class Solution {
    public double myPow(double x, int n) {
        if(n==Integer.MIN_VALUE&&x!=-1&&x!=1){
            return 0;
        }
        int deg=Math.abs(n);
        double ans=1;
        double pow= calcPow(x,deg,ans);
       return (n<0)?1/pow:pow;
    }
    static double calcPow(double x,int deg,double ans){
        if(deg<=0){
            return ans;
        }
        if(deg%2==1){
            ans=ans*x;
            deg--;
        }else{
            x=x*x;
            deg/=2;
        }
        return calcPow(x,deg,ans);
        
    }
}