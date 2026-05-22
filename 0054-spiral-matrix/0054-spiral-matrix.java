class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
         int left=0;
         int right=n-1;
         int top=0;
         int bottom=m-1;
         int i=0;
         List<Integer> list=new ArrayList<>();
         
         while(top<=bottom&&left<=right){
              i=left;
              while(i<=right){
                 list.add(matrix[top][i]);
                 i++;
              }
              i=top;
              i++;
              while(i<=bottom){
                list.add(matrix[i][right]);
                i++;
              }
              i=right;
              i--;
              while(top!=bottom&&i>=left){
                list.add(matrix[bottom][i]);
                i--;
              }
              i=bottom;
              i--;
              while(left!=right&&i>top){
                list.add(matrix[i][left]);
                i--;
              }
              left++;
              right--;
              top++;
              bottom--;
         }
          return list;
    }
   
}