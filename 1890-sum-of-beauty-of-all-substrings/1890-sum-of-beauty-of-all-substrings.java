class Solution {
    public int beautySum(String s) {
      char ch[]=s.toCharArray();
      int n=ch.length;
      
      int sum=0;
      for(int i=0;i<n;i++){
        int[] hash=new int[26];
        hash[ch[i]-'a']++;
        int max=1;
      int min=1;
      int res=0;
        for(int j=i+1;j<n;j++){
          int count=hash[ch[j]-'a']++;
          if(count==max){
            max++;
          } if(count==0){
            min=1;
          }else if(count==min){
            min++;
            for(int k=0;k<26;k++){
                if(hash[k]!=0&&hash[k]<min){
                    min--;
                    break;
                }
            }
          }
          res+=(max-min);
        }
        sum+=res;
      } 
      return sum;
    }
}