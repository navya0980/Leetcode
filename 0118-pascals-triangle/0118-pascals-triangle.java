class Solution {
    public List<List<Integer>> generate(int numRows) {
      
       List<List<Integer>> list=new ArrayList<>();
       for(int i=0;i<numRows;i++){
        int n=i+1;
        list.add(new ArrayList<Integer>());
        int ans=1;
            list.get(i).add(ans);
        for(int j=1;j<=i;j++){
            ans=ans*(n-j);
            ans=ans/j;
            list.get(i).add(ans);

            
        }

       }
       
      return list;  
    }
}