class Solution {
    public int myAtoi(String s) {
    
    s=s.trim();
    if(s.length()==0){
        return 0;
    }
    int isNeg=0;
    int i=0;
    int ans=0;
    if(s.charAt(0)=='-'){
         isNeg=1;
         i=1;
    }else if(s.charAt(0)=='+'){
        i=1;
    }
    while(i<s.length()&&s.charAt(i)=='0'){
        i++;
    }
    return stoint(s,i,ans,isNeg);
    }
    static int stoint(String s,int i,int ans,int isNeg){
        if(i>=s.length()){
            return isNeg==0?ans:ans*-1;
        }
        char ch=s.charAt(i);
        if(ch>='0'&&ch<='9'){
         int c=ch-'0';
         if(ans>(Integer.MAX_VALUE-c)/10){
            return isNeg==1?Integer.MIN_VALUE:Integer.MAX_VALUE;
         }
         ans=ans*10+c;
        return stoint(s,++i,ans,isNeg);
        }
            return isNeg==0?ans:ans*-1;
        
       
    }
}