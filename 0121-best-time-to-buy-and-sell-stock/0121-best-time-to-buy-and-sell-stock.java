class Solution {
    public int maxProfit(int[] prices) {
      int maxProfit=0;
      int min=Integer.MAX_VALUE;
      for(int n:prices){
        if(n<min){
            min=n;
        }else{
            maxProfit=Math.max(maxProfit,n-min);
        }
      }
      return maxProfit;  
    }
}