class Solution {
    public int myAtoi(String s) {
       
        s=s.trim();
         if(s.length()==0){
            return 0;
        }
     
      int isNeg=0;
     
        if(s.charAt(0)=='+'){
             
           return  findNum(s,isNeg,1);
        }else if(s.charAt(0)=='-'){
        
          isNeg=1;
          
             return  findNum(s,isNeg,1);
        }

        return  findNum(s,isNeg,0);
        
       
    
    }
    public static int findNum(String s,int isNeg,int index){
         int ans=0;
          for(int i=index;i<s.length();i++){
               int ch=s.charAt(i)-'0';
              
                if(ch>=0&&ch<=9){
                     if(ans>(Integer.MAX_VALUE-ch)/10){
                if(isNeg==1){
                    return Integer.MIN_VALUE;
                }else{
                    return Integer.MAX_VALUE;
                }
               }
                  ans=ans*10+ch;

                }else{
                   break;  
                }
            }
            if(isNeg==1){
                         return ans*-1;
                       }
                    return ans;

    }
}