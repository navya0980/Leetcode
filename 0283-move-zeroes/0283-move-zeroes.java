class Solution {
    public void moveZeroes(int[] nums) {
     List<Integer>list=new ArrayList<>();
     for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            list.add(nums[i]);
        }
     }  
     int i=0;
     while(i<list.size()){
        nums[i]=list.get(i);
        i++;
     }
     while(i<nums.length){
        nums[i]=0;
        i++;
     }
    }
}