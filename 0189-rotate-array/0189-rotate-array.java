class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
       reverse(0,n-k-1,nums);
       reverse(n-k,n-1,nums);
       reverse(0,n-1,nums); 
    }
    static void reverse(int s,int e,int[] arr){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;e--;
        }
    }
}