class Solution {
    public int reverse(int x) {
        //converts to positive if negative
       int num=Math.abs(x);
       int sum=0;
       while(num>0){

        int rem=num%10;
        if(sum>(Integer.MAX_VALUE-rem)/10)
         return 0;
        sum=sum*10+rem;
        num=num/10;


       }
      if(x<0){
        return sum*-1;
      }
      return sum;
        
    }
    }
