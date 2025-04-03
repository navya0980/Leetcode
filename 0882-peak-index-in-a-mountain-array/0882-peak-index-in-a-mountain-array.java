class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int m=s+(e-s)/2;
            if(m<e&&arr[m]>arr[m+1]){
               e=m;
            }else 
            {
               s=m+1;
            }
        }
        return s;
    }
}