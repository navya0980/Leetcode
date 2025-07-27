class Solution {
    public String largestOddNumber(String num) {
        int index=-1;
        index=Math.max(index,num.lastIndexOf('1'));
        index=Math.max(index,num.lastIndexOf('3'));
        index=Math.max(index,num.lastIndexOf('5'));
        index=Math.max(index,num.lastIndexOf('7'));
        index=Math.max(index,num.lastIndexOf('9'));
        return num.substring(0,index+1);
    }
}