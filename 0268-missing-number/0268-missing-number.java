class Solution {
    public int missingNumber(int[] nums) {
        int max=Arrays.stream(nums).max().getAsInt();
        
       int[] hash=new int[max+1];
       for(int n:nums){
        hash[n]++;
       }
       for(int i=0;i<hash.length;i++){
        if(hash[i]==0){
            return i;
        }
       }
       return max+1;
    }
}