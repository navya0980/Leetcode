class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=Arrays.stream(weights).max().getAsInt();
        int high=(Arrays.stream(weights).sum())*2;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(findDays(weights,mid)<=days){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public static int findDays(int[] nums,int mid){
        int d=0,sum=0;
        for(int i=0;i<nums.length;i++){
           sum+=nums[i];
           if(sum>mid){
            sum=nums[i];
            d++;
           }
        }
        if(sum<=mid){
            d++;
        }
        return d;
    }
}