class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] pos=new int[n/2];
        int[] neg=new int[n/2];
        int i=0,j=0;
        for(int k:nums){
            if(k<0){
                neg[i++]=k;
            }else{
              pos[j++]=k;
            }
        }
        for(int m=0;m<n/2;m++){
            nums[2*m]=pos[m];
            nums[2*m+1]=neg[m];
        }
        return nums;
    }
}