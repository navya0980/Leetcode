class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<(long)m*k){
            return -1;
        }
        int min=0;
        int start=Arrays.stream(bloomDay).min().getAsInt();
        int end=Arrays.stream(bloomDay).max().getAsInt();
        while(start<=end){
            int mid=start+(end-start)/2;
            if(possible(bloomDay,mid,m,k)){
                min=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return min;
        
    }
    public static boolean possible(int[] arr,int day,int m,int k){
        int c=0;
        int noOf=0;
        for(int n:arr){
            if(n<=day){
                c++;
            }else{
                noOf+=c/k;
                c=0;

            }
        }
        noOf+=c/k;
       if(noOf>=m)
        return true;
    else
     return false;
    }
}