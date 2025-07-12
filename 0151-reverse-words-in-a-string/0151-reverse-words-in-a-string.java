class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        StringBuilder str=new StringBuilder("");
        int i=s.length()-1;
        int j=s.length();
        while(i>=0){
            while(i>=0&&s.charAt(i)!=' ')i--;
            str.append(s.substring(i+1,j)+" ");
            while(i>=0&&s.charAt(i)==' '){
                j=i;
                i--;
            }

        }
        str.deleteCharAt(str.length()-1);
        return str.toString();
    }
}