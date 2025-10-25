class Solution {
    public void moveZeroes(int[] nums) {
      List<Integer>list=new ArrayList<>();
      for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            list.add(nums[i]);
        }
      } 
      int i=0;
      for(int n:list){
        nums[i]=n;
        i++;
      } 
      for(int j=i;j<nums.length;j++){
        nums[j]=0;
      }
    }
}