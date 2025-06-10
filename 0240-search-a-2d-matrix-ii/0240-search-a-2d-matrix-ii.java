class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length&&col>=0){
            int n=matrix[row][col];
            if(target>n){
                row++;
            }else if(target<n){
                col--;
            }else{
                return true;
                
            }

        }
        return false;
    }
}