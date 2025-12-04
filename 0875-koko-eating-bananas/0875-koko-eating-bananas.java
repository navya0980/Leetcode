class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=Arrays.stream(piles).max().getAsInt();
        
      
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isMin(mid,h,piles)){
              
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public  static boolean isMin(int min,int hours,int[] arr){
        long h=0;
        for(int i=0;i<arr.length;i++){
           h+=arr[i]/min;
           if(arr[i]%min!=0){
            h++;
           }
         
        }
      return h<=hours;

    }
}