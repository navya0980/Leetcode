class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        int k=0;
        while(k<numRows){
            List<Integer> list=new ArrayList<>();
            int i=0;
            while(i<=k){
                if(i==0||i==k){
                    list.add(1);
                }else{
                    int n=ans.get(k-1).get(i-1)+ans.get(k-1).get(i);
                    list.add(n);
                }
                i++;

            }
            ans.add(list);
            k++;
        }
        return ans;
    }
}