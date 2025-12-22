class Solution {
    public int repeatedStringMatch(String a, String b) {
        int count=1;
        String c=a;
        while(c.indexOf(b)==-1){
           if(c.length()>10000){
            return -1;
           }
            c+=a;
           
            count++;
            System.out.println(a);
        }
        return count;
    }
}