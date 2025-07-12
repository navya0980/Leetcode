class Solution {
    public String reverseWords(String s) {
       char[] ch=s.toCharArray();
       char[] ans=new char[ch.length];
       int end=ch.length-1;
       int start=end;
       int index=0;
       while(start>=0&&end>=0){
        while(end>=0&&ch[end]==' ')end--;
        if(end<0){
            break;
        }
        start=end;
        while(start>=0&&ch[start]!=' ')start--;
        int i=start+1;
        while(i<=end){
            ans[index++]=ch[i++];
        }
        if(start>=0){
          ans[index++]=' ';
        }
        

        end=start;
       } 
       if(index>0&&ans[index-1]==' '){
        index--;
       }

       return new String(ans,0,index);
    }
}