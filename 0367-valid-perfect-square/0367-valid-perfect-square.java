class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==0||num==1){
            return true;
        }
        int start=1;
        int end=num/2;
        boolean ans=false;
        while(start<=end){
            int mid=start+(end-start)/2;
            if((long)mid*mid==num){
               ans=true;
               break;
            }else if((long)mid*mid>num){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
        
    }
}