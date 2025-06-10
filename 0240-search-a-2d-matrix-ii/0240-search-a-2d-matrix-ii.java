class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            int in=bs(matrix[i],target);
            if(in!=-1){
                return true;
            }
        }
        return false;
    }
    public static int bs(int[] arr,int t){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==t){
                return mid;
            }else if(arr[mid]<t){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}