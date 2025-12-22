class Solution {
    public int repeatedStringMatch(String a, String b) {
        int count=1;
        StringBuilder c=new StringBuilder(a);
        while(c.indexOf(b)==-1){
           if(c.length()>10000){
            return -1;
           }
           c.append(a);
           
            count++;
           
        }
        return count;
    }
}