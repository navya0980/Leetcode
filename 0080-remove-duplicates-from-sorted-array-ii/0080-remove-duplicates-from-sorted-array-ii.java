class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=1;
        int k=1;
        int l=1;
        while(i<nums.length&&j<nums.length){
            if(nums[i]==nums[j]&&k%2!=0){
                  int temp=nums[i+1];
                nums[i+1]=nums[j];
                nums[j]=temp;
               i++;
                k++;
                l++;

            }else if(nums[i]!=nums[j]){
                int temp=nums[i+1];
                nums[i+1]=nums[j];
                nums[j]=temp;
                i++;
               
                k=1;
                l++;
            }
            j++;
        }
        return l;
    }
}