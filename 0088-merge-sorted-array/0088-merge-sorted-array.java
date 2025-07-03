class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int curr=nums1.length-1;
        int left=m-1;
        int right=n-1;
        if(left==-1){
            for(int i=0;i<n;i++){
                nums1[i]=nums2[i];
            }
            return;
        }
        if(right==-1){
            return;
        }
        while(left>=0&&right>=0){
           
                nums1[curr]=nums2[right];
                right--;
                curr--;
           
        }
        Arrays.sort(nums1);
    }
}