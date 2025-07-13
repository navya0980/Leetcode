class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder str=new StringBuilder(s);
        int i=0;
        while(i<str.length()){
            int j=0;
            int k=i;
            while(k<str.length()&&j<part.length()&&str.charAt(k)==part.charAt(j)){
                k++;
                j++;

            }
            if(j==part.length()){
                str.replace(i,k,"");
                i=0;
            }else{
                i++;
            }
        }
        return str.toString();
    }
}