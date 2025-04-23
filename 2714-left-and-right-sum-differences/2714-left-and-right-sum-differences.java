class Solution {
    public int[] leftRightDifference(int[] nums) {
        int sum=0;
        int[] temp=new int[nums.length];
        int x=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            temp[i]=Math.abs(sum-nums[i]-x-x);
            x+=nums[i];

        }
        return temp;
    }
}