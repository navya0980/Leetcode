class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int num=x;
        int ans=0;
        while(num>0){
            ans=ans*10+num%10;
            num=num/10;

        }
        return ans==x;
    }
}