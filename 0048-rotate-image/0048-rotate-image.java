class Solution {
    public void rotate(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
       int[][] ans=new int[m][n]; 
       for(int  i=0;i<m;i++){
        for(int j=0;j<n;j++){
            ans[j][n-i-1]=matrix[i][j];
        }
       }
       for(int  i=0;i<m;i++){
        for(int j=0;j<n;j++){
            matrix[i][j]=ans[i][j];
        }
       }
    }
}