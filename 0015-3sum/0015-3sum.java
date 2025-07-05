class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        HashSet<List<Integer>>st=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            HashSet<Integer>set=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int num=-(nums[j]+nums[i]);
                if(set.contains(num)){
                    List<Integer>inner=new ArrayList<>(Arrays.asList(num,nums[i],nums[j]));
                    inner.sort(null);
                   st.add(inner);

                }
                set.add(nums[j]);
            }
        }
        List<List<Integer>>list=new ArrayList<>(st);
        return list;
    }
}