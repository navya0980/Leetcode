class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer>romanMap=new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);
        int result=0;
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
           
            int n1=romanMap.get(ch1);
            if(i<s.length()-1){
                  char ch2=s.charAt(i+1);
                  int n2=romanMap.get(ch2);
                   if(n1<n2){
               result+=(n2-n1);
                i++;

            }else{
               result+=n1;
            }
            }else{
                result+=n1;
            }
            
           
        }
        return result;
       
        
    }
}