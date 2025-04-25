class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=0;i<words.length;i++){
           findIndex(words[i],i,x,temp);
         
        }
        return temp;
        
    }
    public static void findIndex(String str,int index,char ch,ArrayList temp){
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
               temp.add(index);
               return;
            }

        } return;

    }
}