class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>list=new ArrayList<Integer>();
        int l=nums.length;
        Map<Integer,Integer>mp=new HashMap<>();
       
        for(int i=0;i<nums.length;i++){
           int val=mp.getOrDefault(nums[i],0);
           mp.put(nums[i],++val);
        }
       for(Map.Entry<Integer,Integer> map:mp.entrySet()){
        if(map.getValue()>l/3){
            list.add(map.getKey());
        }
       }
        return list;
    }
}