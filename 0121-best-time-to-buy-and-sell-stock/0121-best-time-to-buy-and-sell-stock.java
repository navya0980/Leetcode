class Solution {
    public int maxProfit(int[] prices) {
        int maxPro=0;
        int min=Integer.MAX_VALUE;
        int i=0;
        while(i<prices.length){
            if(prices[i]<min){
                min=prices[i];
            }else if(prices[i]>min){
                maxPro=Math.max(maxPro,prices[i]-min);
            }
            i++;
        }
        return maxPro;
        
    }
}