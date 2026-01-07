class Solution {
    public int strStr(String source, String target) {
         int m=target.length();
       int power=1;
       for(int i=0;i<m;i++){
        power=(power*31);
       }
       int targetCode=0;
       for(int i=0;i<m;i++){
        targetCode=(targetCode*31+target.charAt(i));
       }
       int hashCode=0;
       for(int i=0;i<source.length();i++){
          hashCode=(hashCode*31+source.charAt(i));
          if(i>=m){
            hashCode=(hashCode-source.charAt(i-m)*power);
          }
          if(hashCode==targetCode){
            if(source.substring(i-m+1,i+1).equals(target)){
                return i-m+1;
            }
          }
       }
       return -1;
    
    }
}