class Solution {
    public int shipWithinDays(int[] weights, int days) {
       int start=Arrays.stream(weights).max().getAsInt();
       int end=Arrays.stream(weights).sum();
       int min=0;
       while(start<=end){
        int mid=start+(end-start)/2;
        int d=complete(weights,mid);
        if(d>days){
            start=mid+1;
        }else if(d<days){
            end=mid-1;
        }else{
           min=mid;
           end=mid-1;
        }
       }
       if(min==0){
        return start;
       }
       return min;
    }
    public static int complete(int[] arr,int c){
        int d=1;
        int sum=0;
        for(int n:arr){
            if(sum+n<=c){
                sum+=n;
            }else{
                d++;
                sum=n;
                
            }
           
        }
        
        return d;
    }
}