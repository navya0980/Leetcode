class Solution {
    public List<String> validStrings(int n) {
        List<String> list=new ArrayList<>();
        char[] chars = new char[n];
Arrays.fill(chars, '1');
StringBuilder s = new StringBuilder(new String(chars));
        
        generateBinary(list,s,0,n);
        return list;
    }
    static void generateBinary(List<String> list,StringBuilder s,int i,int n){
        if(i>=n){
            list.add(s.toString());
            return;
        }
        generateBinary(list,s,i+1,n);
        s.setCharAt(i,'0');
        generateBinary(list,s,i+2,n);
        s.setCharAt(i,'1');


    }

}