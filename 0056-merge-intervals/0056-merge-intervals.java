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
           
            int j=i+1;
            while(j<n&&intervals[j][0]<=b){
                if(intervals[j][1]>=b)
                   b=intervals[j][1];
               j++;
            }
            list.add(a);
            list.add(b);
            i=j;
           


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