class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
       
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i!=0&&nums[i]==nums[i-1])continue;
           
           for(int j=i+1;j<nums.length;j++){
            if(j>i+1&&nums[j]==nums[j-1])continue;
             int left=j+1;
            int right=nums.length-1;
            while(left<right){
                long n=nums[i]+nums[j];
                n+=nums[left]+nums[right];
                if(n<target){
                    left++;
                }else if(n>target){
                    right--;
                }else{
                  List<Integer>temp=Arrays.asList(nums[i],nums[j],nums[left],nums[right]);
                  list.add(temp);
                  left++;
                  right--;
                  while(left<right&&nums[left]==nums[left-1])left++;
                  while(left<right&&nums[right]==nums[right+1])right--;
                  
                }
            }
           }
        }
        return list;
    }
}