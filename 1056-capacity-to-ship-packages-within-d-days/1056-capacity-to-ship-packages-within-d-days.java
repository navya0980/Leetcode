class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=Arrays.stream(weights).max().getAsInt();
        int high=Arrays.stream(weights).sum();
       
        int min=0;
        while(low<=high){
            int mid=low+(high-low)/2;
           int d=capacity(weights,mid);
           if(d<days){
            high=mid-1;
           }else if(d>days){
            low=mid+1;
           }else{
            min=mid;
            high=mid-1;
           }

        }
        if(min==0){
            return low;
        }
        return min;

    }
    public static int capacity(int[] arr,int min){
        int sum=0;
        int d=1;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]<=min){
                sum+=arr[i];
            }else{
                sum=arr[i];
                 d++;
            }
           
           
        }
        return d;
    }
}