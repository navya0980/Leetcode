class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       Set<List<Integer>> list=new HashSet<>();
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
               
                
                int sum=nums[i]+nums[j];
                int diff=0-sum;
                if(map.containsKey(diff)&& map.get(diff)!=i&&map.get(diff)!=j){
                   List<Integer> temp=new ArrayList<>(Arrays.asList(nums[i],nums[j],diff));
                   Collections.sort(temp);
                    list.add(temp);
                }

        }
       }
       List<List<Integer>> finalList=new ArrayList<>();
       for(List li:list){
        finalList.add(li);
       }
       return finalList;
    }
}