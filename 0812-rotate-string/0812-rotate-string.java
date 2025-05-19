class Solution {
    public boolean rotateString(String s, String goal) {
        
     StringBuilder a=new StringBuilder(s);
   
   int n=1;
       
        while(n<=s.length()){
            reverse(1,s.length()-1,a);
          
            reverse(0,s.length()-1,a);
          
            s=a.toString();
            if(s.equals(goal)){
              return true;
            }
            n++;
        }
      return false;
        
    }
    public static void reverse(int start,int end,StringBuilder s){
        while(start<end){
            char temp=s.charAt(end);
            s.setCharAt(end,s.charAt(start));
            s.setCharAt(start,temp);
            
            start++;
            end--;
        }
    }
}