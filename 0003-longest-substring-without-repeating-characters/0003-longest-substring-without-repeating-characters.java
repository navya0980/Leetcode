class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            ArrayList<Character>list=new ArrayList<>();
            int c=0;
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                if(!list.contains(ch)){
                    list.add(ch);
                    c++;
                }else{
                    break;
                }
            }
            max=Math.max(max,c);
        }
        return max;
    }
}