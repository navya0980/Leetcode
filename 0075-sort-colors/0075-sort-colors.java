class Solution {
    public void sortColors(int[] nums) {
        int zero=0,one=0,two=0;
        for(int n:nums){
            if(n==0){
                zero++;
            }else if(n==1){
                one++;
            }else{
                two++;
            }
        }
        int i=0,j=0;
        while(j<zero){
            nums[i]=0;
            i++;
            j++;
        }
        j=0;
        while(j<one){
            nums[i]=1;
            i++;
            j++;
        }
        j=0;
        while(j<two){
            nums[i++]=2;
            j++;
        }
    }
}