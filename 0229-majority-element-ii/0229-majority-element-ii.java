class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1=0;
        int c2=0;
        int el1=Integer.MIN_VALUE;
        int el2=el1;
        for(int i=0;i<nums.length;i++){
            if(c1==0&&nums[i]!=el2){
                el1=nums[i];
               c1=1;
            }else if(c2==0&&nums[i]!=el1){
                el2=nums[i];
                c2=1;
            }else if(nums[i]==el1){
                c1++;
            }else if(nums[i]==el2){
                c2++;
            }else{
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==el1)c1++;
            if(nums[i]==el2)c2++;
        }
        int n=nums.length/3;
        List<Integer>list=new ArrayList<>();
        if(c1>n)list.add(el1);
        if(c2>n)list.add(el2);
        return list;
    }
}