class Solution {
    public int removeDuplicates(int[] nums) {
       int i=0;
        int k=1;
        int l=1;
        for(int j=1;j<=nums.length-1;j++){
           
           if(nums[j]==nums[i]&&k%2!=0){
            nums[i+1]=nums[j];
            i++;
            k++;
            l++;
           }else if(nums[j]!=nums[i]){
            nums[i+1]=nums[j];
            i++;
           k=1;
           l++;
           }

        }
        return l;
    }
}