class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        List<Integer>list=new ArrayList<>();
        int i=0;
        while(i<n){
            int a=intervals[i][0];
            int b=intervals[i][1];
           
            if(list.isEmpty()){
                list.add(a);
                list.add(b);
                continue;
            }
            if(a<=list.get(list.size()-1)){
                list.set(list.size()-1,Math.max(list.get(list.size()-1),b));
            }
            else{
                list.add(a);
                list.add(b);
            }
            i++;

        }
        int[][] merge=new int[list.size()/2][2];
        int index=0;
        for(int k=0;k<list.size();k++){
           if(k%2==0){
                merge[index][0]=list.get(k);
            }else{
                merge[index][1]=list.get(k);
                index++;
            }
        }
        return merge;
    }
}