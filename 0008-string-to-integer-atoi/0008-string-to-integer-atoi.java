class Solution {
    public int myAtoi(String s) {
        int i=0;int sign=1;int num=0;
        while(i<s.length()&&s.charAt(i)==' '){
            i++;
        }
        if(i<s.length()&&(s.charAt(i)=='-'||s.charAt(i)=='+')){
            if(s.charAt(i)=='-'){
                sign=-1;
            }
            i++;
        }
        int ans=getNumber(s,i,sign,num);
        if(ans==Integer.MIN_VALUE){
            return ans;
        }
        return sign*ans;
    }
    static int getNumber(String s,int i,int sign,int num){
        if(i>=s.length()){
            return num;
        }
        int ch=s.charAt(i)-'0';
        if(ch>=0&&ch<=9){
           
            if(num>(Integer.MAX_VALUE-ch)/10){
                if(sign==-1){
                    return Integer.MIN_VALUE;
                }
                return Integer.MAX_VALUE;
            }
            num=num*10+ch;
            return getNumber(s,i+1,sign,num);
        }else{
            return num;
        }
    }
}