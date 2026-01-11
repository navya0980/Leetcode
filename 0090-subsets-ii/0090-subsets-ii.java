class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
         Arrays.sort(nums);
        combination(0,nums,list,ans);
        return ans;  
    }
    static void combination(int index,int[] arr,ArrayList list,List<List<Integer>> ans){
        if(index>=arr.length){
           if(!ans.contains(list)){
             ans.add(new ArrayList<>(list));
           }
            return;
        }
        for(int i=index;i<arr.length;i++){
            if(i>index&&arr[i]==arr[i-1])continue;
           
            list.add(arr[i]);
            combination(i+1,arr,list,ans);
            list.removeLast();
            combination(i+1,arr,list,ans);
        }
    }
}