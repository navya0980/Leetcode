class Solution {
    public int missingNumber(int[] nums) {
        int max=Arrays.stream(nums).max().getAsInt();
        
        for(int i=0;i<=max;i++){
            int count=0;
            for(int n:nums){
                if(i==n){
                    count=1;
                    break;
                }
            }
            if(count==0){
                return i;
            }
        }
        return max+1;
    }
}