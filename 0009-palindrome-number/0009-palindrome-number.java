class Solution {
    public boolean isPalindrome(int x) {
         
        if(x<0){
            //negative number can never be a palindrome
            return false;
        }
        int reversedNumber=0;
        int num=x;
        while(num>0){
            reversedNumber=reversedNumber*10+num%10;
            num/=10;
        }
        return reversedNumber==x;

    }
}