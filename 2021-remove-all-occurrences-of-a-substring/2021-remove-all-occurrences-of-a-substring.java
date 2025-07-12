class Solution {
    public String removeOccurrences(String s, String part) {
       char[] input=s.toCharArray();
       char[] target=part.toCharArray();
       char[] resultStack=new char[input.length];
       int stackSize=0,targetLength=target.length;
       char targetChar=target[targetLength-1];
       for(char currentChar:input){
        resultStack[stackSize++]=currentChar;
        if(currentChar==targetChar&&stackSize>=targetLength){
         int i=stackSize-1;int j=targetLength-1;
         while(j>=0&&resultStack[i]==target[j]){
            i--;
            j--;
         }
         if(j<0){
            stackSize=i+1;
         }
        }
       }
       return new String(resultStack,0,stackSize);

    }
}