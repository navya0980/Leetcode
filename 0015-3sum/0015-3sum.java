class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        List<List<Integer>> ans=new ArrayList<>();
        Set<List<Integer>>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int sum=nums[i]+nums[j];
                int diff=0-sum;
                if(map.containsKey(diff)){
                    int index=map.get(diff);
                    if(index!=i&&index!=j){
                        List<Integer>list=new ArrayList<>(Arrays.asList(nums[i],nums[j],diff));
                        Collections.sort(list);
                        set.add(list);
                    }
                }
            }
        }
        for(List li:set){
          ans.add(li);
        }
        return ans;
    }
}