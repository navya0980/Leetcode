class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int dupIndex=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
           
            int len=mid-start+1;
            if(mid>0 &&  nums[mid-1]==nums[mid]){
                 dupIndex=mid-1;
            }else if(mid<nums.length-1 && nums[mid+1]==nums[mid]){
                dupIndex=mid+1;
            }
            else{
                return nums[mid];
            }

            String isEvenOrOdd=(len%2==0)?"even":"odd";
            if(start<=dupIndex&&dupIndex<=mid ){
                if(isEvenOrOdd=="odd"){
                    
                     end=mid-2;
                }else{
                   start=mid+1;
                }
            }else {
                if(isEvenOrOdd=="even"){
                    end=mid-1;
                }else{
                    start=mid+2;
                }
            }
         }
         return nums[end];
    }
}