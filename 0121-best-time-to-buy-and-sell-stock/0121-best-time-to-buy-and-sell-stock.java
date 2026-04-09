class Solution {
    public int maxProfit(int[] prices) {
        int i=0;
        int maxProfit=0;
        int min=Integer.MAX_VALUE;
        while(i<prices.length){
           if(prices[i]<min){
            min=prices[i];
           }else{
            maxProfit=Math.max(maxProfit,prices[i]-min);
           }
           i++;
        }
        return maxProfit;
    }
}