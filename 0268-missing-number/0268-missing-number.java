class Solution {
    public int missingNumber(int[] nums) {
      int n=nums.length;
      int xor1=0;
      for(int i=0;i<=n;i++){
        xor1^=i;
      } 
      for(int i=0;i<n;i++){
        xor1^=nums[i];
      } 
      return xor1;
    }
}