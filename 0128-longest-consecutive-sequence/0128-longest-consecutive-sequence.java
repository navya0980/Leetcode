class Solution {
    public int longestConsecutive(int[] nums) {
        int longSeq=0;
        int counter=1;
        if(nums.length==1){
            return 1;
        }
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1==nums[i+1]){
                counter++;
                
            }else if(nums[i]==nums[i+1]){
                continue;
            }else{
                  longSeq=Math.max(longSeq,counter);    
                counter=1;
            }
        }
         longSeq=Math.max(longSeq,counter);
       
        return longSeq;
    }
}