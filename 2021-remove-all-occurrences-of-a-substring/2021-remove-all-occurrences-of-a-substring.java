class Solution {
    public String removeOccurrences(String s, String part) {
        char[] input=s.toCharArray();
        char[] target=part.toCharArray();
        char[] result=new char[input.length];
        int size=0,targetLength=target.length;
        char targetChar=target[targetLength-1];
       for(char currChar:input ){
        result[size++]=currChar;
        if(currChar==targetChar&&size>=targetLength){
            int i=size-1;
            int j=targetLength-1;
            while(j>=0&&result[i]==target[j]){
                i--;j--;
            }
            if(j<0){
                size=i+1;
            }
        }
       }
       return new String(result,0,size);
    }
}