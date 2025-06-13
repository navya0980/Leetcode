class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int n:nums){
            if(n!=0){
                list.add(n);
            }
        }
        int index=0;
        for(int n:list){
             nums[index]=n;
             index++;
        }
        for(int i=index;i<nums.length;i++){
            nums[i]=0;
        }
    }
}