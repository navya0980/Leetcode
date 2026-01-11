class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        combination(0,candidates,target,list,ans);
        return ans;
    }
    static void combination(int i,int[] arr,int target,ArrayList list, List<List<Integer>>  ans){
        if(i>=arr.length){
            if(target==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(arr[i]<=target){
            list.add(arr[i]);
            combination(i,arr,target-arr[i],list,ans);
            list.removeLast();
        }
        combination(i+1,arr,target,list,ans);
    }
}