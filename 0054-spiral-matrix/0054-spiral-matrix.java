class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top=0,left=0,right=matrix[0].length-1,bottom=matrix.length-1;
        int i=0;
        List<Integer>list=new ArrayList<>();
        while(left<=right&&top<=bottom){
            i=left;
            while(i<=right){
                list.add(matrix[top][i]);
                i++;

            }
            
            i=top;i++;
            while(i<=bottom){
                list.add(matrix[i][right]);
                i++;
            }
            top++;
            i=right;i--;
           if(top<=bottom){
             while(i>=left){
                list.add(matrix[bottom][i]);
                i--;
            }
           }
            right--;
            i=bottom;i--;
           if(left<=right){
             while(i>=top){
                list.add(matrix[i][left]);
                i--;
            }
           }
            bottom--;
            left++;

        }
        return list;
    }
}