class Solution {
    public int reversePairs(int[] nums) {
        
   int n=nums.length;
      return mergesort(nums,0,n-1);
    }
    public static int mergesort(int[] a,int start,int end){
        int c=0;
        if(start>=end)
          return c;
        int mid=start+(end-start)/2;

        c+=mergesort(a,start,mid);
        c+=mergesort(a,mid+1,end);
        c+=count(a,start,mid,end);
        merge(a,start,mid,end);
        return c;
    }
    public static int count(int[] arr,int start,int mid,int end){
        int c=0;
        int left=start;
        int right=mid+1;
        while(left<=mid){
            while(right<=end&&(long)arr[left]>2*(long)arr[right]){
                right++;  
               
            }
            c+=(right-(mid+1));
            
            left++;

        }
        return c;
    }
    public static void merge(int[] a,int s,int m,int e){
        ArrayList<Integer>list=new ArrayList<>();
       
        int low=s;
        int high=m+1;
        while(low<=m&&high<=e){
            if((long)a[low]<=(long)a[high]){
                list.add(a[low]);
                low++;
            }else{
                list.add(a[high]);
                high++;
            }
        }
        while(low<=m){
            list.add(a[low]);
            low++;
        }
        while(high<=e){
            list.add(a[high]);
            high++;
        }
        for(int i=s;i<=e;i++){
            a[i]=list.get(i-s);
        }
        
       
    }
}