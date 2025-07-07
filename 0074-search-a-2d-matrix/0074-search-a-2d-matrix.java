class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=0;
        int n=matrix[0].length-1;
        while(m<matrix.length&&n>=0){
            int num=matrix[m][n];
            if(num==target){
                return true;
            }else if(num<target){
                m++;
            }else{
                n--;
            }
        }
        return false;
    }
}