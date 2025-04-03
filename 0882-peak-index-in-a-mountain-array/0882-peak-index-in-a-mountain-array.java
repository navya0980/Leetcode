class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]>arr[m+1]){
                if(arr[m]>arr[m-1]){
                      return m;
                }else{
                    e=m-1;
                }
             
            }else 
            {
               s=m+1;
            }
        }
        return -1;
    }
}