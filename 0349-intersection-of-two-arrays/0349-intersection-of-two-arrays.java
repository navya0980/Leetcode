class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList<>();
       Arrays.sort(nums1);
       Arrays.sort(nums2);
       int left=0,right=0;
       while(left<nums1.length&&right<nums2.length){
           if(nums1[left]<nums2[right]){
            left++;
           }else if(nums2[right]<nums1[left]){
            right++;
           }else{
            if(!list.contains(nums1[left])){
                list.add(nums1[left]);
            }
            left++;
            right++;
           }
       } 
       return list.stream().mapToInt(Integer::intValue).toArray();
}
}