class Solution {
    public int sumFourDivisors(int[] nums) {
       int maxSum=0;
       for(int i=0;i<nums.length;i++){
        int n=nums[i];
        int sum=1+n;
         int count=0;
        
       
           
            int div=2;
           
            while(div*div<=n){
               int rem=n%div;
               if(rem==0){
                count++;
                sum+=div;
                int ans=n/div;
                if(div!=ans){
                    count++;
                    sum+=ans;
                }
                
               }
               if(count>2){
                break;
               }
               div++;
            }
       
       if(count==2){
         maxSum+=sum;
       }
       } 
       return maxSum;
    }
}