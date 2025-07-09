class Solution {
    public int maxProduct(int[] nums) {
        
        long maxProd=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            long product=1;
            for(int j=i;j<nums.length;j++){
                product*=nums[j];
                maxProd=Math.max(maxProd,product);
            }
        }
        return (int)maxProd;

    }
}