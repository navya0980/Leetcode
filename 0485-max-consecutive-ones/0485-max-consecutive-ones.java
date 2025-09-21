class Solution {
    
    public  int findMaxConsecutiveOnes(int[] nums) {  
        int c1 = 0;
        int c2 = 0;
        for(int num : nums) {
            if(num == 1) {
                c1++;
            } 
            else {
                c2 = Math.max(c1, c2);
                c1 = 0;           } 
        }

        c2 = Math.max(c1, c2);

        return c2;
        
    }
}