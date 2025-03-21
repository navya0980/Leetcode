class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int[] a:accounts){
            int sum=0;
            for(int n:a){
                sum+=n;
            }
            if(sum>max)
            max=sum;
        }
        return max;
    }
}