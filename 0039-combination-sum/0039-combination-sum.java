class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        fun(candidates,0,target,list,ans);
        return ans;
    }
    static void fun(int[] arr,int n,int target,ArrayList list,List<List<Integer>> ans){
        if(n>=arr.length){
            if(target==0){
                ans.add(new ArrayList<>(list));
            }
            return ;
        }
       if(arr[n]<=target){
         list.add(arr[n]);
        fun(arr,n,target-arr[n],list,ans);
        list.removeLast();
       }
        fun(arr,n+1,target,list,ans);


    }
}