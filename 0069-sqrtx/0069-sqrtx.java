class Solution {
    public int mySqrt(int x) {
        if(x==0||x==1)
        return x;
        int start=1;
        int end=x;
        int mid=-1;
        while(start<=end){
            mid=start+(end-start)/2;
           long smid=(long)mid*mid;
            if(smid==x){
                return mid;
            }else if(smid>x){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return end;
        
    }
}