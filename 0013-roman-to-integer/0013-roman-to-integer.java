class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> mp=new HashMap<>();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);
        int num=0;
        for(int i=0;i<s.length();){
            if(i<s.length()-1&&mp.get(s.charAt(i))<mp.get(s.charAt(i+1))){
                num+=mp.get(s.charAt(i+1))-mp.get(s.charAt(i));
                i=i+2;
            }else{
                num+=mp.get(s.charAt(i));
                i++;
            }

        }
        return num;
        
    }
}