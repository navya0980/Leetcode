class Solution {
    public int repeatedStringMatch(String a, String b) {
        if(a.equals(b)){
            return 1;
        }
        String c=a;
        int count=1;
        while(c.length()<b.length()){
            c+=a;
            count++;
        }
        if(!c.contains(b)){
           
             c+=a;
            count++;
        }
        if(!c.contains(b)){
           return -1;
        }

         return count;
    }
}