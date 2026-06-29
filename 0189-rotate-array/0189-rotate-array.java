class Solution {
    public void rotate(int[] nums, int k) {
        int[] temp=new int[nums.length];
        
        int n=nums.length;
        k=k%n;
        int index=0;
        for(int i=n-k;i<n;i++){
           temp[index++]=nums[i];
        }
        for(int i=0;i<n-k;i++){
            temp[index++]=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=temp[i];
        }
    }
}