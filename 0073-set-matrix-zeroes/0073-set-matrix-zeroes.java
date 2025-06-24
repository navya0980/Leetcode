class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    markRow(i,n,matrix);
                    markCol(j,m,matrix);
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==-10){
                    matrix[i][j]=0;
                }
            }
        }
        

    }
    public void markRow(int row,int n,int[][] arr){
           for(int i=0;i<n;i++){
            if(arr[row][i]!=0){
                arr[row][i]=-10;
            }
           }
    }
    public void markCol(int col,int m,int[][] arr){
        for(int i=0;i<m;i++){
            if(arr[i][col]!=0){
                arr[i][col]=-10;
            }
        }
    }
}