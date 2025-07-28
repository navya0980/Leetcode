class Solution {
    public String countAndSay(int n) {
      return count(n-1);
    }
    public static String count(int n){
         if(n==0){
        return "1";
       } 
       String s=count(n-1);
       StringBuilder str=new StringBuilder();
       char c=s.charAt(0);
       int count=0;
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)==c){
            count++;
           }else{
            str.append(count);
            str.append(c);
            c=s.charAt(i);
            count=1;
           }
       }
       str.append(count);
            str.append(c);
            return str.toString();
    }
}