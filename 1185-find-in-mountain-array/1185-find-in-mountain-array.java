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
        if(mountainArr.length()==1){
            if(mountainArr.get(0)==target){
                return 0;
            }else{
                return -1;
            }
        }
        if(mountainArr.length()==0){
            return 0;
        }
        int s=0;
        int e=mountainArr.length()-1;
        int p=find( mountainArr,s,e);
        if(p==-1){
          return binary(mountainArr,s,e,target,true);
        }
        int ans=binary(mountainArr,0,p,target,true);
        if(ans==-1){
            ans=binary(mountainArr,p+1,e,target,false);
        }
        return ans;
        
    }
    static int binary(MountainArray mountainArr,int s,int e,int t,boolean a){
        while(s<=e){
            int m=s+(e-s)/2;
            if(mountainArr.get(m)==t){
                return m;
            }
            if(a){
                if(mountainArr.get(m)>t){
                    e=m-1;
                }else{
                    s=m+1;
                }
            }else{
                if(mountainArr.get(m)<t){
                    e=m-1;
                }else{
                    s=m+1;
                }
            }
        }
        return -1;
    }
    static int find(MountainArray mountainArr,int s,int e){
        while(s<=e){
            int m=s+(e-s)/2;
            if(mountainArr.get(m)>mountainArr.get(m+1)){
                if(mountainArr.get(m)>mountainArr.get(m-1)){
                    return m;
                }else{
                    e=m-1;
                }
            }else{
                s=m+1;
            }
        }
        return -1;
    }
}