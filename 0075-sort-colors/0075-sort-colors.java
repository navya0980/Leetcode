class Solution {
    public void sortColors(int[] nums) {
       int c0=0;
       int c1=0;
       int c2=0;
       for(int n:nums){
        if(n==0){
            c0++;
        }else if(n==1){
            c1++;
        }else{
            c2++;
        }
       }
       int index=0;
       while(c0>0){
        nums[index]=0;
        c0--;
        index++;
       }
       while(c1!=0){
        nums[index]=1;
        c1--;
        index++;
       }
       while(c2!=0){
        nums[index]=2;
        c2--;
        index++;
       }
    }
}