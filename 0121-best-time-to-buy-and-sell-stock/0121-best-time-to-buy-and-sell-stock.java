class Solution {
    public int maxProfit(int[] prices) {
        int maxProf=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }else{
                maxProf=Math.max(maxProf,prices[i]-min);
            }
        }
        return maxProf;
      
    }
}