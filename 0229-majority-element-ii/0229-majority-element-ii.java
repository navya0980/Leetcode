class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>list=new ArrayList<>();
        int c1=0;
        int c2=0;
        int el1=Integer.MIN_VALUE;
        int el2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(c1==0&&nums[i]!=el2){
                c1=1;
                el1=nums[i];
            }else if(c2==0&&nums[i]!=el1){
                c2=1;
                el2=nums[i];

            }else if(nums[i]==el1){
                c1++;
            }else if(nums[i]==el2){
                c2++;
            }else{
                c1--;
                c2--;
            }
        }
        int min=(int)(nums.length/3)+1;
        c1=0;c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==el1)c1++;
            if(nums[i]==el2)c2++;
        }
        if(c1>=min)list.add(el1);
        if(c2>=min)list.add(el2);
        Collections.sort(list);
        return list;
    }
}