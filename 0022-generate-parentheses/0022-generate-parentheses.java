class Solution {
    public List<String> generateParenthesis(int n) {
       List<String> list=new ArrayList<>();
       genFunc(list,"",0,0,n); 
       return list;
    }
    static void genFunc(List<String> list,String curr,int open,int close,int n){
        if(close==n){
           list.add(curr);
           return;
        }
        if(open<n){
            genFunc(list,curr+"(",open+1,close,n);
        }
        if(close<open){
            genFunc(list,curr+")",open,close+1,n);
        }
    }
}