class Solution {
    public int reverse(int x) {
        int n=Math.abs(x);
       int sum=0;
       while(n>0){

        int rem=n%10;
        if(sum>(Integer.MAX_VALUE-rem)/10)
         return 0;
        sum=sum*10+rem;
        n=n/10;


       }
      if(x<0){
        return sum*-1;
      }
      return sum;
        
    }
    }
