class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                Set<Long>st=new HashSet<>();
                for(int k=j+1;k<n;k++){
                   long sum=nums[i]+nums[j];
                   sum+=nums[k];
                   long rem=target-sum;
                   if(st.contains(rem)){
                   List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                    temp.add((int)rem);
                      Collections.sort(temp);
                      if(!list.contains(temp)){
                        list.add(temp);
                      }
                   }
                  
                    st.add((long)nums[k]);
                
                }
            }
        }
        return list;
    }
}