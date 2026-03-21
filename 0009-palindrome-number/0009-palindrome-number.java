class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
         return false;
        int num=x;
        int reversedNumber=0;
        while(num>0){
            reversedNumber=reversedNumber*10+num%10;
            num=num/10;
        }
        return reversedNumber==x;
    }
}