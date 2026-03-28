class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
       List<Integer>list=new ArrayList<>();
        
        for(int i=0;i<n1;i++){
            int num=nums1[i];
            for(int j=0;j<n2;j++){
                if(nums2[j]==num&&!list.contains(num)){
                  list.add(num);
                }
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}