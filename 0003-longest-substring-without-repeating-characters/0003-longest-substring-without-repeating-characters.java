class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer>mp=new HashMap<>();
        int left=0;
        int right=0;
        int len=0;
        int maxLen=0;
        while(left<s.length()&&right<s.length()){
            Character ch=s.charAt(right);
            if(mp.containsKey(ch)){
                int i=mp.get(ch);
                if(i>=left){
                    left=i+1;
                }
                
                
            }
                mp.put(ch,right);
                len=right-left+1;
                maxLen=Math.max(len,maxLen);
                right++;
        }
        return maxLen;
    }
}