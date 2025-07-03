class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int i = 0,j = 0,k = 0;
        int zero = 0;
        for(int i = m;i<nums1.size();i++){
            if(!nums1[i]) zero++;
        }
        reverse(nums1.begin(),nums1.end());
        reverse(nums1.begin()+zero,nums1.end());

        i = zero;

        while(i < (m+n) && j < n){
            if(nums1[i] < nums2[j]){
                nums1[k] = nums1[i];
                k++;
                i++;
            }
            else if(nums1[i] > nums2[j]){
                nums1[k] = nums2[j];
                j++;
                k++;
            }
            else{
                nums1[k] = nums1[i];
                k++;
                i++;
                nums1[k] = nums2[j];
                j++;
                k++;
            }
        }
        while(j < n){
            nums1[k] = nums2[j];
            k++;
            j++;
            cout<<k<<" "<<j<<endl;
        }

        while(i < (m+n)){
            nums1[k] = nums1[i];
            i++;
            k++;
        }
    }
};