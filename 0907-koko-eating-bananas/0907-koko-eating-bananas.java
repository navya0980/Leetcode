class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
       for(int i=0;i<piles.length;i++){
         max=Math.max(max,piles[i]);
       }
      int start=1;
      int end=max;
     
      while(start<=end){
        int mid=start+(end-start)/2;
        int hrs=0;
        for(int i=0;i<piles.length;i++){
              hrs+=Math.ceil((double)piles[i]/(double)mid);
        }
        if(hrs<=h){
             end=mid-1;
           
        }else{
           start=mid+1;
           
        }
      }
      return start;
    }
}