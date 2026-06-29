class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer>set=new TreeSet<>();
        for(int n:nums){
            set.add(n);
        }
        int i=0;
        for(Integer n:set){
          nums[i]=n;
          i++;
        }
        return i;
    }
}