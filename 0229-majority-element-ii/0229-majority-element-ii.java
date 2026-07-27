class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>list=new ArrayList<>();
        int el1=-1,el2=-1,c1=0,c2=0;
        for(int n:nums){
            if(c1==0&&el2!=n){
                c1++;
                el1=n;
            }else if(c2==0&&el1!=n){
                c2++;
                el2=n;
            }else if(n==el1){
                c1++;
            }else if(n==el2){
                c2++;
            }else{
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        for(int n:nums){
          if(n==el1){
            c1++;
          }else if(n==el2){
            c2++;
          }
        }
        if(c1>(nums.length/3)){
            list.add(el1);
        }
        if(c2>(nums.length/3)){
            list.add(el2);
        }
        return list;
    }
}