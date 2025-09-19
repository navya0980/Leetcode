class Solution {
    public int reverse(int x) {
        //converts to positive if negative
       int num=Math.abs(x);
       long sum=0;
       while(num>0){

       
       
        sum=sum*10+ num%10;
        num=num/10;


       }
      if(sum>Integer.MAX_VALUE||sum<Integer.MIN_VALUE){
        return 0;
      }
      if(x<0){
        return (int)sum*-1;
      }
      return (int)sum;
        
    }
    }
