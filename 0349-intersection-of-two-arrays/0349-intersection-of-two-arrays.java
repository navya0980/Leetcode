class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int max1=Arrays.stream(nums1).max().getAsInt();
        int max2=Arrays.stream(nums2).max().getAsInt();
        int max=(max1>max2)?max1:max2;
        int hash[]=new int[max+1];
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            hash[nums1[i]]=1;
        }
        for(int i=0;i<nums2.length;i++){
           if(hash[nums2[i]]==1 &&!list.contains(nums2[i])){
            list.add(nums2[i]);
           }
        }
       return list.stream().mapToInt(Integer::intValue).toArray();
    }
}