class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
         int ans[]=new int[2];
        int range=(int)Math.pow(n,2);
        for(int i=1;i<=range;i++){
            int num=i;
            int count=0;
            
          for(int k=0;k<n;k++){
            for(int j=0;j<n;j++){
              if(num==grid[k][j]){
                    count++;
                  
              }
               
                
            }
        }
        if(count==2){
            ans[0]=num;
        }
        if(count==0)
         ans[1]=num;
        }
       
        
       
        return ans;
        
    }
}