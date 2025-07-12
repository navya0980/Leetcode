class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder str=new StringBuilder(s);
       int i=0;
       while(i<str.length()){
        int p=i;
        int j=0;
        while(p<str.length()&&j<part.length()&&str.charAt(p)==part.charAt(j)){
            p++;
            j++;
        }
        if(j==part.length()){
            str.replace(i,p,"");
            i=0;
        }else{
            i++;
        }
        

       }
        return str.toString();
    }
}