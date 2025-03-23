/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start=0;
        int end=mountainArr.length()-1;
       int peak= findPeak(start,end,mountainArr);
       int ans=firstSearch(mountainArr,0,peak,target);
       if(ans==-1)
         ans=secondSearch(mountainArr,peak+1,mountainArr.length()-1,target);
         
       return ans;

       
        
    }
    static int firstSearch(MountainArray mountainArr,int start,int end,int target){
        int mid=-1;
        while(start<=end){
           mid=start+(end-start)/2;
           if(mountainArr.get(mid)==target)
            return mid;
        else if(mountainArr.get(mid)>target)
         end=mid-1;
        else start=mid+1;
        }
        return -1;
    }
    static int secondSearch(MountainArray mountainArr,int start,int end,int target){
        int mid=-1;
        while(start<=end){
           mid=start+(end-start)/2;
           if(mountainArr.get(mid)==target)
            return mid;
        else if(mountainArr.get(mid)>target)
         start=mid+1;
        else end=mid-1;
        }
        return -1;
    }
    
    static int findPeak(int start,int end,MountainArray mountainArr){
       int mid=-1;
        while(start<=end){
           mid=start+(end-start)/2;
            if(mountainArr.get(mid)>mountainArr.get(mid+1)){
                if(mountainArr.get(mid)>mountainArr.get(mid-1)){
                     return mid;
                }
                else{
                     end=mid-1;

                }
            

            }
            else start=mid+1;

        }
        return mid;
        
    
    }
}