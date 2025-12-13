class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal)){
            return true;
        }
        char[] ch1=s.toCharArray();
        char[] ch2=goal.toCharArray();
        for(int i=0;i<ch1.length;i++){
            reverse(ch1,1,ch1.length-1);
            reverse(ch1,0,ch1.length-1);
            if(Arrays.equals(ch1,ch2)){
                return true;
            }
        }
        return false;

    }
    public static void reverse(char[] ch,int start,int end){
        while(start<end){
            char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }
    }
}