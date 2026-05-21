class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        
        for(int i=0;i<n;i++){
           reverse(matrix[i],0,n-1);
        }
        for(int i=0;i<n;i++){
           for(int j=0;j<n-i-1;j++){
            int temp=matrix[i][j];
            matrix[i][j]=matrix[n-j-1][n-i-1];
            matrix[n-j-1][n-i-1]=temp;
            
           }
        }
        
    }
    public static void reverse(int[] arr,int s ,int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;e--;
        }
    }
}