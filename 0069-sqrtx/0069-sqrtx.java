class Solution {
    public int mySqrt(int x) {
        if(x==1)
        return x;
        int start=2;
        int end=x/2;
        long mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(mid*mid==x)
             return (int)mid;
            else if(mid*mid>x)
            end=(int)mid-1;
            else start=(int)mid+1;
        }
        return end;


        
    }
}