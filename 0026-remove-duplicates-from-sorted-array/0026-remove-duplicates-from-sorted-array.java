class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer>set=new TreeSet<>();
        for(int n:nums){
            set.add(n);
        }
        int index=0;
        for(int m:set){
          nums[index]=m;
          index++;
        }
        return index;
    }
}