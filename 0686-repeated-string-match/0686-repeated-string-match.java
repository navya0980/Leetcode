class Solution {
    private static int BASE=1000000;
    public int repeatedStringMatch(String a, String b) {
       if(a.equals(b)){
        return 1;
       } 
       String c=a;
       int count=1;
       while(c.length()<b.length()){
        c+=a;
        count++;
       }
       if(c.equals(b))return count;
       if((rabinKarp( c, b))!=-1)return count;
       if((rabinKarp( c+a, b))!=-1)return count+1;
       return -1;
    }
    public static int rabinKarp(String source,String target){
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
                return i;
            }
          }
       }
       return -1;
    }
}