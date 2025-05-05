class Solution {
    public void rotate(int[][] matrix) {
       
        int[][] arr=new int[matrix.length][matrix.length];

        for(int i=0;i<matrix.length;i++){
           
            
            for(int j=0;j<matrix[i].length;j++){
                arr[j][matrix.length-1-i]=matrix[i][j];
               
                

            }

            
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[i][j]=arr[i][j];
            }
        }
        
    }
}