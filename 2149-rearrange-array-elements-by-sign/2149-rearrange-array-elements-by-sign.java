class Solution {
    public int[] rearrangeArray(int[] nums) {
       int[] arr=new int[nums.length];
       int pos=0;int neg=1;
       for(int n:nums){
        if(n<0){
            arr[neg]=n;
            neg+=2;
        }else{
            arr[pos]=n;
            pos+=2;
        }
       } 
       return arr;
    }
}