class Solution {
    public String countAndSay(int n) {
        return rle("1",n-1);
    }
    public static String rle(String num,int n){
        if(n==0){
            return num;
        }
        StringBuilder ans=new StringBuilder();
        int count=0;
        char def='\0';
        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);
            if(count==0){
              def=ch;
            }
            if(ch==def){
                count++;
            }else{
               ans.append(count+"");
               ans.append(def);
               count=1;
               def=ch; 
            }
        }
         ans.append(count+"");
               ans.append(def);
            
        return rle(ans.toString(),n-1);
    }
}