class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        r(0,n-k-1,nums);
        r(n-k,n-1,nums);
        r(0,n-1,nums);
    }
    public static void r(int start,int end,int[] arr){
        
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
    }
}