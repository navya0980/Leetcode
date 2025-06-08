class Solution {
    public int findKthPositive(int[] arr, int k) {
        int start=1;
        long end=Arrays.stream(arr).max().getAsInt()*10;
      TreeSet<Integer> set=new TreeSet<>();
      for(int i=start;i<=end;i++){
        if(!contains(arr,i)){
             set.add(i);
        }
        if(set.size()==k){
            break;
        }

      }
      return set.last();


    }
    public static boolean contains(int[] arr,int m){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==m){
                return true;
            }else if(arr[mid]<m){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
       return false;
    }
}