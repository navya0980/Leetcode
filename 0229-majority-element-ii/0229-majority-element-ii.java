class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>list=new ArrayList<Integer>();
        int l=nums.length;
        for(int i=0;i<nums.length;i++ ){
            int count=0;
            int n=nums[i];
            for(int j=0;j<nums.length;j++ ){
                if(nums[j]==n){
                    count++;
                }
            }
            if(count>l/3 && !list.contains(n)){
                list.add(n);
            }
        }
        return list;
    }
}