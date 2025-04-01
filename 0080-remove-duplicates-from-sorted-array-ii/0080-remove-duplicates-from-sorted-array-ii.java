class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=i+1;
        int k=1;
        int l=1;
        while(i<nums.length&&j<nums.length){
                if(nums[j]==nums[i]&&k%2!=0){
                    nums[i+1]=nums[j];
                    k++;
                    l++;
                     i++;
              
                    
                   
                }else if(nums[j]!=nums[i])
                {
                    nums[i+1]=nums[j];
                 
                   k=1;
                   l++;
                    i++;
               

                }
                j++;
               
                
        }
        return l;
        
    }
}