class Solution {
    public int repeatedStringMatch(String a, String b) {
        if(a.equals(b)) return 1;
     StringBuilder c=new StringBuilder(a);
     int count=1;
     while(c.length()<b.length()){
        c.append(a);
        count++;
     } 
     if(c.indexOf(b)!=-1){
            return count;
     }  
    c.append(a);
     if(c.indexOf(b)!=-1){
            return count+1;
     }
     return -1;

    }
}