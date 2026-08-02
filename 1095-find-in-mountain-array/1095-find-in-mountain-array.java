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
        int start=0,end=mountainArr.length()-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1)){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        int peak=start;
        int minIndex=bs( mountainArr,0,peak,true,target);
        return (minIndex!=-1)?minIndex:bs(mountainArr,peak+1,mountainArr.length()-1,false,target);
    }
    static int bs(MountainArray mountainArr,int start,int end,boolean isAsc,int target){
        while(start<=end){
            int mid=start+(end-start)/2;
            int num=mountainArr.get(mid);
            if(isAsc){
                if(num<target){
                    start=mid+1;
                }else if(num>target){
                    end=mid-1;
                }else{
                    return mid;
                }
            }else{
                if(num<target){
                    end=mid-1;   
                }else if(num>target){
                    start=mid+1;
                   
                }else{
                    return mid;
                }
            }
        }
        return -1;
    }
}