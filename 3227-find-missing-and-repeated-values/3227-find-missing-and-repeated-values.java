class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        long n=grid.length;
        long total=n*n;
        long sum=0;
        long sqr=0;
        int[] ans=new int[2];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum+=grid[i][j];
                sqr+=grid[i][j]*grid[i][j];

            }
        }
        long sumDiff=sum-(total*(total+1)/2);
        long sqrDiff=sqr-(total*(total+1)*(2*total+1))/6;
        ans[0]=(int)(sqrDiff/sumDiff+sumDiff)/2;
        ans[1]=(int)(sqrDiff/sumDiff-sumDiff)/2;
        return ans;
    }
}