class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
       int[] temp=new int[nums.length-k];
       for(int i=0;i<temp.length;i++){
         temp[i]=nums[i];
       } 
       
       int d=nums.length-k;
       for(int i=d;i<nums.length;i++){
        nums[i-d]=nums[i];
        
       }

       for(int i=k;i<nums.length;i++){
        nums[i]=temp[i-k];
       
       }
    }
}