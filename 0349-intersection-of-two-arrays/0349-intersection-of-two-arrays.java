class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer>list1=new ArrayList<>();
        List<Integer>list2=new ArrayList<>();
        List<Integer>list=new ArrayList<>();

        int left=0,right=0;
        while(left<nums1.length&&right<nums2.length){
            int num1=nums1[left],num2=nums2[right];
            if(list2.contains(num1)&&!list.contains(num1)){
               list.add(num1);
            }
            list1.add(num1);
            if(list1.contains(num2)&&!list.contains(num2)){
               list.add(num2);
            }
            list2.add(num2);
            left++;right++;
        }
        while(left<nums1.length){
            int num1=nums1[left];
            if(list2.contains(num1)&&!list.contains(num1)){
               list.add(num1);
            }
            left++;
        }
        while(right<nums2.length){
            int num2=nums2[right];
            if(list1.contains(num2)&&!list.contains(num2)){
               list.add(num2);
            }
            left++;right++;
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
        
    }
}