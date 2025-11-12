class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int maxProf=0;
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