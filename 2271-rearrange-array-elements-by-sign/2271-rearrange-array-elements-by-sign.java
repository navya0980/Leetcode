class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int[] a=new int[nums.length/2];
        int[] b=new int[nums.length/2];
        int f=0;
        int s=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                a[f]=nums[i];
                f++;

            }else{
                b[s]=nums[i];
                s++;

            }
        }
        f=0;
        s=0;
        for(int i=0;i<nums.length;i++){
        if(i%2==0){
            nums[i]=a[f];
            f++;
        }else{
            nums[i]=b[s];
            s++;
        }
        }
        return nums;
    }
}