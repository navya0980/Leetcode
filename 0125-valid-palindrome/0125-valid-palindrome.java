class Solution {
    public boolean isPalindrome(String s) {
        s=s.trim().toLowerCase();
        
        int st=0,e=s.length()-1;
        while(st<e){
            char ch1=s.charAt(st);
            char ch2=s.charAt(e);
            if((ch1>='a'&&ch1<='z')||(ch1>='0'&&ch1<='9')){
                if((ch2>='a'&&ch2<='z')||(ch2>='0'&&ch2<='9')){
                    if(ch1!=ch2)
                     return false;
                    else
                     st++;e--;
                }else{
                    e--;
                }
            }else{
                st++;
            }
        }
        return true;
    }
}