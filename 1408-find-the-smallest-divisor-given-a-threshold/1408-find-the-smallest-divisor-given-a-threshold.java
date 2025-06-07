class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start=1;
        int end=Arrays.stream(nums).max().getAsInt();
        int smallestInt=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(findSum(nums,mid)>threshold){
                start=mid+1;
            }else{
                smallestInt=mid;
                end=mid-1;

            }
        }
        return smallestInt;
        
    }
    public static int findSum(int[] nums,int div){
        int sum=0;
        for(int n:nums){
         sum+=Math.ceil((double)n/(double)div);
        }
        return sum;
    }

}