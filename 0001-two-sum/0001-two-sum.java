class Solution {
    public int[] twoSum(int[] nums, int target) {
       List<Integer>list=new ArrayList<>();
       for(int i=0;i<nums.length;i++){
        if(list.contains(target-nums[i])){
            return new int[]{i,list.indexOf(target-nums[i])};
        }
        list.add(nums[i]);
       }
       return new int[]{-1,-1};
    }
}