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
        if(mountainArr.length()==1 ){
            if(mountainArr.get(0)==target)
             return 0;
            else
             return -1;
        }
        if(mountainArr.length()==0){
            return -1;
        }
        int start=0;
        int end=mountainArr.length()-1;
        int peak=findPeak(start,end,mountainArr);
        if(peak!=-1 ){
            if(mountainArr.get(peak)==target)
            return peak;
            
        }
        else
         return binarySearch(start,end,mountainArr,target,true);

      
        int ans=binarySearch(start,peak,mountainArr,target,true);
        if(ans==-1){
           ans= binarySearch(peak+1,end,mountainArr,target,false);
        }
       
           return ans;
        
        

       
   
    }
    static int binarySearch(int start,int end,MountainArray mountainArr,int target,boolean isAsc){
           while(start<=end)
           {
            int mid=start+(end-start)/2;
            if(mountainArr.get(mid)==target){
                return mid;
            }
            if(isAsc==true){
                if(mountainArr.get(mid)>target)
                 end=mid-1;
                 else start=mid+1;

            }else{
                if(mountainArr.get(mid)>target)
                 start=mid+1;
                 else end=mid-1;


            }
           }
           return -1;
    }
    
     static int findPeak(int start,int end,MountainArray mountainArr){
         while(start<end){
            int mid=start+(end-start)/2;
            if(mountainArr.get(mid)>mountainArr.get(mid+1)){
                if(mountainArr.get(mid)>mountainArr.get(mid-1)){
                    return mid;
                }
                else{
                      end=mid-1;
                }
                
            }
            else
             start=mid+1;
          
        }
        return start;
     }
}