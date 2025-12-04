class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
       
        if(bloomDay.length<m*k){
            return -1;
        }
        int n=bloomDay.length;
        if(m>(n/k))return -1;
        int low=Arrays.stream(bloomDay).min().getAsInt();
        int high=Arrays.stream(bloomDay).max().getAsInt();
        while(low<=high){
            int mid=low+(high-low)/2;
            if(noOfBoquets(bloomDay,mid,k)>=m){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public static int noOfBoquets(int[] arr,int days,int k){
        int b=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(count==k){
                b++;
                count=0;
            }
            if(arr[i]<=days){
                count++;
            }else{
                count=0;
            }
        }
        if(count==k){
            b++;
        }
        return b;
    }
}