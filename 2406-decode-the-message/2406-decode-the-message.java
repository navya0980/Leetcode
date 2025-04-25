class Solution {
    public String decodeMessage(String key, String message) {
         String str="";
        char a='a'-1;
        HashMap<Character,Character>mp=new HashMap<>();

        for(int i=0;i<key.length();i++){
          char ch=key.charAt(i);
         
          if(ch==' '||mp.containsKey(ch)){
            continue;
          }else{
            mp.put(ch,++a);
            
           
          }
        }
        for(int i=0;i<message.length();i++){
          char ch=message.charAt(i);
          if(ch==' '){
            str=str+" ";
           
          }else{
            str=str+mp.get(ch);
           
          }

        }
      
         
        return str;
    }
}