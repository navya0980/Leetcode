/**
 * // This is MountainmountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length()() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
         int start=0;
        int end=mountainArr.length()-1;
        int max=0;
        while(start<end){
            int mid=start+(end-start)/2;
            // if(mountainArr.get(mid)>mountainArr.get(mid+1)&&mountainArr.get(mid)>mountainArr.get(mid-1)){
            //    max=mid;
            //     break;
            // }
             
               if(mountainArr.get(mid)<mountainArr.get(mid+1))
                start=mid+1;
            else 
            end=mid;
        }
        max=start;

        int anss=min( mountainArr,target,0,max,true);
        if(anss==-1){
            anss=min(mountainArr,target,max,mountainArr.length()-1,false);
        }
      
      
        
       
          

       return anss; 
     
    }
     static int min(MountainArray mountainArr,int target,int start,int end,boolean isLeft){
            int ans=-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(mountainArr.get(mid)==target){
                    ans= mid;
                   break;
                }
               
                else if(isLeft){
                    if(mountainArr.get(mid)>target)
                    end=mid-1;
                    else
                    start=mid+1;
                }else{
                   if(mountainArr.get(mid)>target)
                    start=mid+1;
                    else
                    end=mid-1;
                }
                }

return ans;
            }

 }
  