class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        int div=1;
        while(div<=num/2){
            if(num%div==0){
                sum+=div;

             }
             div++;
        }
        return sum==num;
    }
}