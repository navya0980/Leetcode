class Solution {
    public int repeatedStringMatch(String a, String b) {
     String c=a;
     int count=1;
     while(c.length()<b.length()){
        c=c+a;
        count++;
     } 
     if(c.contains(b)){
            return count;
     }  
     c+=a;
     if(c.contains(b)){
            return ++count;
     }
     return -1;

    }
}