class Solution {
    public double myPow(double x, int num) {
         if(num==Integer.MIN_VALUE && x!=1 && x!=-1){
            return 0;
        }
        double ans=1;
        int n=num;
        if(num<0){
            n*=-1;
            
        }
      while(n>0){
        
         if(n%2==1){
        ans=ans*x;
         n-=1;
        }else{
            n=n/2;
            x=x*x;
        }
      }
      if(num<0){
        return 1/ans;
      }
      return ans;
    }
}