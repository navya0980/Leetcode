class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str=new StringBuilder(s.toLowerCase());
        int left=0;
        int right=str.length()-1;
        while(left<right){
            char ch1=str.charAt(left);
            char ch2=str.charAt(right);
            if((ch1>='a'&&ch1<='z')||(ch1>='0'&&ch1<='9')){
                if((ch2>='a'&&ch2<='z')||(ch2>='0'&&ch2<='9')){
                    if(ch1!=ch2){
                        return false;
                    }
                    left++;
                    right--;
                }else{
                    right--;
                }

            }else{
                left++;
            }
        }
        return true;
    }
}