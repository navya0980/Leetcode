class Solution {
    public String reverseWords(String s) {
       
       char ans[]=new char[s.length()];
       int index=0;
       int end=s.length()-1;
       int start=end;
       while(start>=0&&end>=0){
        while(end>=0&&s.charAt(end)==' '){
            end--;
        }
        if(end<0){
            break;
        }
        start=end;
        while(start>=0&&s.charAt(start)!=' '){
            start--;
        }
        for(int i=start+1;i<=end;i++){
            ans[index++]=s.charAt(i);
            
        }
       if(index<ans.length){
         ans[index++]=' ';
       }
       
        
        end=start;
       }
       if(ans[index-1]==' ')
        index--;
       
       return new String(ans,0,index);
    }
}