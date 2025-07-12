class Solution {
    public int compress(char[] chars) {
        if(chars.length==1){
            return 1;
        }
        int i=0,j=i+1,curr=0,n=chars.length;
        while(i<n){
            while(j<n&&chars[j]==chars[i])j++;
            
            int len=j-i;
            if(len==1){
                chars[curr++]=chars[i];
                

            }else if(len<10){
                chars[curr++]=chars[i];
                chars[curr++]=Integer.toString(len).charAt(0);
            }else{
                chars[curr++]=chars[i];
                String temp=len+"";
                for(int k=0;k<temp.length();k++){
                    chars[curr++]=temp.charAt(k);
                }
            }
            i=j;
            j=i+1;
        }
        
      
       return curr;
    }
}