class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length-k-1);
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);
    }
    static void reverse(int[] arr,int s,int e){
        while(s<e){
            int temp=arr[s];
            arr[s++]=arr[e];
            arr[e--]=temp;
        }
    }
}