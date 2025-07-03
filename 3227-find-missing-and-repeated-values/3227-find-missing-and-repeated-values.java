class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
         int ans[]=new int[2];
        
        int range=(int)Math.pow(n,2);
         int[] hash=new int[range+1];
       for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               hash[grid[i][j]]++;
            }
        }
        for(int i=1;i<hash.length;i++){
            if(hash[i]==2){
                ans[0]=i;
            }
            if(hash[i]==0){
                ans[1]=i;
            }
        }
        
       
        return ans;
        
    }
}