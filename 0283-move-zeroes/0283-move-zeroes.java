class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int n:nums){
            if(n!=0){
                list.add(n);
            }
        }
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        for(int i=list.size();i<nums.length;i++){
            nums[i]=0;
        }
    }
}