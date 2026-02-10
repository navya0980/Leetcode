class Solution {
    public double myPow(double x, int n) {
        if(n==Integer.MIN_VALUE&&x!=1&&x!=-1){
            return 0;
        }
        double num=1;
        double ans=findPow(x,num,Math.abs(n));
        if(n<0){
            return 1/ans;
        }
        return ans;
    }
    static double findPow(double x,double num,int n){
       if(n<=0){
        return num;
       }
       if(n%2==1){
        num=num*x;
        n--;
       }else{
        x*=x;
        n/=2;
       }
       
       return findPow(x,num,n);
        
    }
}