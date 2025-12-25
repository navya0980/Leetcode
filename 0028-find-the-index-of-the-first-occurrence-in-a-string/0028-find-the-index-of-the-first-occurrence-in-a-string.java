class Solution {
    private static final int prime=101;
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length()){
            return -1;
        }
        int patternLen=needle.length();
       double haystackHash=calculateHash(haystack.substring(0,patternLen));
       double needleHash=calculateHash(needle);
       for(int i=0;i<=haystack.length()-patternLen;i++){
        if(haystackHash==needleHash){
            if(haystack.substring(i,i+patternLen).equals(needle)){
                return i;
            }
        }
        if(i<haystack.length()-patternLen){
            haystackHash=updateHash(haystackHash,haystack.charAt(i),haystack.charAt(i+patternLen),patternLen);
        }
       }
       return -1;

    }
    public static double calculateHash(String str){
        double hash=0;
        for(int i=0;i<str.length();i++){
            hash+=str.charAt(i)*Math.pow(prime,i);
        }
        return hash;
    }
    public static double updateHash(double prevHash,char oldChar,char newChar,int patternLen){
        double newHash=(prevHash-oldChar)/prime;
        newHash=newHash+newChar*Math.pow(prime,patternLen-1);
        return newHash;
    }
}