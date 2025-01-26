class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        char ans=letters[start];
        if(target=='z'||target>=letters[end])
        return ans;
        while(start<=end){
            int mid=start+(end-start)/2;
           if(letters[mid]<=target){
                start=mid+1;
            }else if(letters[mid]>target){
                end=mid-1;

            }
        }
       return letters[start];

        
    }
}