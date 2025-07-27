class Solution {
    public String reverseWords(String s) {
       char ch[]=s.toCharArray();
       char ans[]=new char[ch.length];
       int index=0;
       int end=ch.length-1;
       int start=end;
       while(start>=0&&end>=0){
        while(end>=0&&ch[end]==' '){
            end--;
        }
        if(end<0){
            break;
        }
        start=end;
        while(start>=0&&ch[start]!=' '){
            start--;
        }
        for(int i=start+1;i<=end;i++){
            ans[index++]=ch[i];
            
        }
       if(index<ch.length){
         ans[index++]=' ';
       }
       
        
        end=start;
       }
       if(ans[index-1]==' ')
        index--;
       
       return new String(ans,0,index);
    }
}