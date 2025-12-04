class Solution {
    public int findKthPositive(int[] arr, int k) {
       
        int index=findIndex(arr,k);
        if(index==-1){
           return k;
        }
       
        return arr[index]+(k-(arr[index]-index-1));

    }
    public static int findIndex(int[] arr,int k){
        int start=0, end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]-mid-1<k){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return end;
    }
}