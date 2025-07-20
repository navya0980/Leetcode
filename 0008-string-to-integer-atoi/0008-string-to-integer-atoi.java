class Solution {
    public int myAtoi(String s) {
        if(s.length()==0){
            return 0;
        }
         int i=0;
         
         int ans=0;
         boolean minus=false;
         while(i<s.length()&&s.charAt(i)==' '){

            i++;
         }
         if(i<s.length()&&s.charAt(i)=='-'){
          minus=true;   
            i++;
         }else if(i<s.length()&&s.charAt(i)=='+')i++;
         while(i<s.length()&&s.charAt(i)=='0'){
            i++;
         }
         while(i<s.length()&&s.charAt(i)>='0'&&s.charAt(i)<='9'){
           Character ch=s.charAt(i);
           int n=ch-'0';
           if(ans>(Integer.MAX_VALUE-n)/10){
            if(minus==false){
              return Integer.MAX_VALUE;  
            }else{
                return Integer.MIN_VALUE;
            }
                
           }
           
            ans=ans*10+n;
            

            
            i++;
         }
         if(minus==true){
            return ans*-1;
         }
         return ans;
    }
}