class Solution {
    public String longestPalindrome(String s) {
        char ch[]=s.toCharArray();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<ch.length;i++){
            //odd length strings
            int left=i,right=i;
            while(left>=0&&right<ch.length&&ch[left]==ch[right]){
                StringBuilder temp=new StringBuilder(s.substring(left,right+1));
                if(temp.length()>ans.length()){
                    ans=temp;
                }
                left--;
                right++;
            }
            left=i;
            right=i+1;
            while(left>=0&&right<ch.length&&ch[left]==ch[right]){
                StringBuilder temp=new StringBuilder(s.substring(left,right+1));
                if(temp.length()>ans.length()){
                    ans=temp;
                }
                left--;
                right++;
            }

        }
        return ans.toString();
    }

}