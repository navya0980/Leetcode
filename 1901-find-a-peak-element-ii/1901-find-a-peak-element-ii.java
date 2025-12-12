class Solution {
    public int[] findPeakGrid(int[][] mat) {
      int low=0;
      int high=mat[0].length;
      while(low<=high){
        int mid=low+(high-low)/2;
        int maxIndex=findMax(mat,mid);
        if(mid>0&&mat[maxIndex][mid]<mat[maxIndex][mid-1]){
            high=mid-1;
        }else if(mid<mat[0].length-1&&mat[maxIndex][mid]<mat[maxIndex][mid+1]){
            low=mid+1;
        }else{
           return new int[]{maxIndex,mid};
        }
      }
      return new int[]{-1,-1};  
    }
    public static int findMax(int[][] mat,int m){
        int n=mat.length;
        int max=Integer.MIN_VALUE;
        int maxIndex=-1;
        for(int i=0;i<n;i++){
            if(mat[i][m]>max){
                max=mat[i][m];
                maxIndex=i;
            }
        }
        return maxIndex;
    }
}