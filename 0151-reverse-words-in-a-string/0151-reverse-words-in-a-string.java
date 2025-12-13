class Solution {
    public String reverseWords(String s) {
        int start=0,end=s.length()-1;
        StringBuilder ans=new StringBuilder();
        while(start>=00&&end>=0){
           while(end>=0&&s.charAt(end)==' '){
            end--;
           }
           start=end;
           while(start>=0&&s.charAt(start)!=' '){
            start--;
           }
          if(end>=0){
             ans.append(s.substring(start+1,end+1));
              ans.append(" ");
          }
           end=start;
          

        }
     
        return ans.substring(0,ans.length()-1).toString();
    }
}