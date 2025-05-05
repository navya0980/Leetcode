class Solution {
    public void rotate(int[][] matrix) {
        int index1=0;
        int index2=matrix[0].length-1;
        int[][] arr=new int[matrix.length][matrix.length];

        for(int i=0;i<matrix.length;i++){
            index1=0;
            
            for(int j=0;j<matrix[i].length;j++){
                arr[index1][index2]=matrix[i][j];
                index1++;
                

            }

            index2--;
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[i][j]=arr[i][j];
            }
        }
        
    }
}