class Solution {
    public int search(int[] nums, int target) {
       
        int pivot=findPivot(nums);
        
        if(target<=nums[nums.length-1]){
            return bs(nums,target,pivot,nums.length-1);
        }
        return bs(nums,target,0,pivot-1);

    }
    static int findPivot(int[] nums) {
    int s = 0, e = nums.length - 1;

    while (s < e) {
        int m = s + (e - s) / 2;

        if (nums[m] > nums[e]) {
            s = m + 1;
        } else {
            e = m;
        }
    }

    return s;
}
    static int bs(int[] nums,int target,int s,int e){
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m]==target){
                return m;
            }else if(nums[m]<target){
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return -1;
    }
}