class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>list=new ArrayList<>();
        int n=0;
        while(n<numRows){
            List<Integer>temp=new ArrayList<>();
            for(int i=0;i<=n;i++){
                if(i==0||i==n){
                    temp.add(1);
                }else{
                    int val=list.get(n-1).get(i-1)+list.get(n-1).get(i);
                    temp.add(val);
                }
            }
            list.add(temp);
            n++;
        }
        return list;
    }
}