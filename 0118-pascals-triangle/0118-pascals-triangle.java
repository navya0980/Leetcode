class Solution {
    public List<List<Integer>> generate(int numRows) {
       int i=0;
       List<List<Integer>> list=new ArrayList<>();
       while(i<numRows){
        int j=0;
         list.add(new ArrayList<>());
        while(j<=i){
           if(j==0||j==i){
             list.get(i).add(1);
           }else{
            
            list.get(i).add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
           }
           j++;
           
        }
        i++;

       }
      return list;  
    }
}