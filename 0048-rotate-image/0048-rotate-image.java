class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int[][] ans=new int[n][n];
        for(int i=0;i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                   ans[j][n-i-1]=matrix[i][j];
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                 matrix[i][j]=ans[i][j];
            }
        }
        
        
    }
}