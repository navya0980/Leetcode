class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        int num=x;
        int ld=0;
        int pal=0;
        while(num>0){
            ld=num%10;
            pal=pal*10+ld;
            num=num/10;


        }
       return x==pal;
        
    }
}