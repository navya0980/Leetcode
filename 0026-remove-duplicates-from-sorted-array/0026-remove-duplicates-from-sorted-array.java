class Solution {
    public int removeDuplicates(int[] nums) {
        //Two pointer approach
        int i=0,j=1;
        while(j<nums.length){
            while(j<nums.length&&nums[i]==nums[j]){
                j++;
            }
           if(j<nums.length){
            nums[i+1]=nums[j];
            i++;
           }
           System.out.println(i);
        }
        
        return i+1;
    }
}