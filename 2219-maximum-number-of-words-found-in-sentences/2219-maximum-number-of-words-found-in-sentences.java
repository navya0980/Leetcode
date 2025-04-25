class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i<sentences.length;i++){
         if(find(sentences[i])>max){
            max=find(sentences[i]);
         }

        }
        return max+1;
    }
    public static int find(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        return count;
    }
}