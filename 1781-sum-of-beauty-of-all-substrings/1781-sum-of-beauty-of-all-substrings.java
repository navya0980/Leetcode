class Solution {
    public int beautySum(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int[] hash=new int[26];
            for(int j=i;j<s.length();j++){
                hash[s.charAt(j)-'a']++;
                 int max=Arrays.stream(hash).max().getAsInt();
                int min=Integer.MAX_VALUE;
                for(int k=0;k<hash.length;k++){
                        if(hash[k]<min&&hash[k]!=0){
                            min=hash[k];
                        }

                }
                if(min!=0&&max!=0){
                    ans+=max-min;
                }
               
            }
           
               
        }
        return ans;
    }
}