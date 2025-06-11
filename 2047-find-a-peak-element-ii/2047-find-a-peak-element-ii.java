class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int low=0;
        int high=mat[0].length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int max=0;int index=-1;
            for(int i=0;i<mat.length;i++){
                if(mat[i][mid]>max){
                    index=i;
                    max=mat[i][mid];
                }
            }
            if(mid==0||max>mat[index][mid-1]){
                if(mid==mat[0].length-1||max>mat[index][mid+1]){
                    return new int[]{index,mid};
                }else{
                    low=mid+1;
                }
            }else{
                high=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
}