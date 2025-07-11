class Solution {
    public String reverseWords(String s) {
        char[] st = s.toCharArray();
        char[] arr = new char[st.length];
        int index = reverse(st, arr, 0);
        return new String(arr, 0, index);
    }
    private int reverse(char[] st, char[] arr, int start){
        while(start < st.length && st[start] == ' '){
            start++;
        }
        int end = start;
        while(end < st.length && st[end] != ' '){
            end++;
        }
        if(start == end){
            return 0;
        }
        int reverseLen = reverse(st, arr, end);
        if(reverseLen != 0){
            arr[reverseLen++] = ' ';
        }
        while(start < end){
            arr[reverseLen++] = st[start++];
        }
        return reverseLen;
    }
}