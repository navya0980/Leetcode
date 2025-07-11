class Solution {
    public String reverseWords(String s) {
        if(s.length()==0){
            return s;
        }
        StringBuilder str=new StringBuilder("");
        s=s.trim();
        int i=s.length()-1;
        int j=s.length();
        while(i>=0&&j>=0){
           if(s.charAt(i)==' '){
            str.append(s.substring(i+1,j)+" ");
            j=i;
            i--;
            while(i>=0&&s.charAt(i)==' '){
                j=i;
                i--;
            }
           }else{
            i--;
           }
        }
        str.append(s.substring(i+1,j));
        return str.toString();
    }
}