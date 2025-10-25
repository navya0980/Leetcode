class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        List<Integer>temp=new ArrayList<>();
        for(int i=n-k;i<nums.length;i++){
            temp.add(nums[i]);
        }
        int j=n-1;
        for(int i=n-k-1;i>=0;i--){
            nums[j]=nums[i];
            j--;
        }
        for(int i=0;i<k;i++){
            nums[i]=temp.get(i);
        }
    }
}