class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>list=new ArrayList<>();
        int l=nums.length;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int c=0;
            if(!list.contains(n)){
                for(int j=0;j<nums.length;j++){
                        if(nums[j]==n){
                            c++;
                        }
                }
                if(c>l/3){
                  list.add(n);
                }
            }
        }
        return list;
    }
}