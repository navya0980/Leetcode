class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] arr1=new int[256];
        int[] arr2=new int[256];
       
       int index=1;
        for(int i=0;i<s.length();i++){
            int ch1=s.charAt(i);
            int ch2=t.charAt(i);
            if(arr1[ch1]!=arr2[ch2]){
                return false;
            }
            arr1[ch1]=index;
            arr2[ch2]=index;
            index++;
        }
        return true;


        
    }
}