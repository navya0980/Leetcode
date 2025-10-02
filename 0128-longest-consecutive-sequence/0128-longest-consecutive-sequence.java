class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer>list=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        int longSeq=0;
        for(int n:list){
           
           if(!list.contains(n-1)){
                int counter=1;
                int x=n;
                while(list.contains(x+1)){
                    counter++;
                    x++;
                }
                longSeq=Math.max(longSeq,counter);

            }
        }
        return longSeq;

    }
}