class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>list=new ArrayList<>();
        int n=0;
        while(n<numRows){
            List<Integer>temp=new ArrayList<>();
            temp.add(1);
            int res=1;
            for(int i=1;i<=n;i++){
               res=res*(n-i+1);
               res/=i;
               temp.add(res);
            }
            list.add(temp);
            n++;
        }
        return list;
    }
}