class Solution {
    public String reverseWords(String s) {
        ArrayList<String>list=new ArrayList<>();
        s=s.trim();
        int i=s.length()-1;
        int j=s.length();
        while(i>=0&&j>=0){
            if(s.charAt(i)==' '){
                list.add(s.substring(i+1,j)+" ");
                j=i;
                i--;
                while(i>=0&&s.charAt(i)==' '){
                    j=i;
                    i--;
                }
            }else{
                i--;
            }
        }
        list.add(s.substring(i+1,j));
        StringBuilder ans=new StringBuilder("");
        for(String st:list){
           ans.append(st);
        }
        return ans.toString();
    }
}