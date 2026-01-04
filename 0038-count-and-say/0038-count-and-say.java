class Solution {
    public String countAndSay(int n) {
        StringBuilder ans=new StringBuilder("1");
        return rle(n-1,ans);
    }
    public static String rle(int n,StringBuilder ans){
        if(n==0){
            return ans.toString();
        }
        StringBuilder str=new StringBuilder();
       int count=0;
       char ch='\0';
       for(int i=0;i<ans.length();i++){
        if(count==0){
            ch=ans.charAt(i);
        }
        if(ch==ans.charAt(i)){
            count++;
        }else{
            str.append(count);
            str.append(ch);
            count=1;ch=ans.charAt(i);
        }
       }
        str.append(count);
        str.append(ch);
        return rle(n-1,str);

    }
}