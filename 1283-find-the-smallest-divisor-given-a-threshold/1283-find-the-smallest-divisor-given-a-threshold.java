class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=1000000;
        while(low<high){
            int mid=low+(high-low)/2;
            if(sumOf(nums,mid)<=threshold){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public static int sumOf(int[] nums,int mid){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=(nums[i]+mid-1)/mid;
        }
        return sum;
    }
}