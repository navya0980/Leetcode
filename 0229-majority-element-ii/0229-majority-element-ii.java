class Solution {
    public List<Integer> majorityElement(int[] nums) {
       
        List<Integer>list=new ArrayList<>();
        int el1=-1;
        int c1=0;
        int el2=-1;
        int c2=0;

        for(int i=0;i<nums.length;i++){
            if(c1==0&&el2!=nums[i]){
                c1++;
                el1=nums[i];
            }else if(c2==0&& el1!=nums[i]){
                c2++;
                el2=nums[i];
            }else if(el1==nums[i]){
                c1++;
            }else if(el2==nums[i]){
                c2++;
            }else{
                c1--;
                c2--;
            }
        }
        c1=0;c2=0;
        for(int n:nums){
            if(n==el1){
                c1++;
            }else if(n==el2) {
                c2++;
            }
        }
        if(c1>nums.length/3){
            list.add(el1);
        }
        if(c2>nums.length/3){
            list.add(el2);
        }
        return list;
    }
}