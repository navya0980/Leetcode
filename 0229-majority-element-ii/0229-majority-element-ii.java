class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>list=new ArrayList<Integer>();
        int l=nums.length;
        Map<Integer,Integer>mp=new HashMap<>();
       
        for(int i=0;i<nums.length;i++){
           int val=mp.getOrDefault(nums[i],0);
           mp.put(nums[i],++val);
           if(mp.get(nums[i])>l/3&&!list.contains(nums[i])){
            list.add(nums[i]);
           }
           if(list.size()==2){
            break;
           }
        }
       
        return list;
    }
}