class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer>list=new ArrayList<>();
        for(int num:nums){
            int count=0;
            if(list.size()==0||list.get(0)!=num){
                 for(int k:nums){
                    if(k==num){
                        count++;
                    }
                    if(count>n/3){
                        list.add(num);
                        break;
                    }
                 }
            }
            if(list.size()>=2){
                break;
            }
        }
        return list;
    }
}