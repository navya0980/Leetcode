class Solution {
    public int[] rearrangeArray(int[] nums) {
        //BRUTEFORCE
        int n=nums.length;
       int[] pos=new int[n/2];
       int[] neg=new int[n/2];
       int j=0,k=0;
       for(int i=0;i<n;i++){
        if(nums[i]<0){
            neg[k]=nums[i];
            k++;
        }else{
            pos[j]=nums[i];
            j++;
        }
       } 
       for(int i=0;i<n/2;i++){
        nums[i*2]=pos[i];
        nums[i*2+1]=neg[i];
       }
       return nums;
    }
}