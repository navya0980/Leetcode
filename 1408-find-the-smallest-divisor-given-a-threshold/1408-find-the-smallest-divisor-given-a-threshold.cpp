class Solution {
public:

    int sumByD(vector<int> arr, int divisor) {
        int n = arr.size();
        int sum = 0;
        for(int i = 0; i<n; i++) {
            sum += ceil((double)(arr[i])/(double)(divisor));
        }
        return sum;
    }
    int smallestDivisor(vector<int>& nums, int threshold) {
        int l = 1, h = *max_element(nums.begin(), nums.end()), ans = -1;
        while(l<=h) {
            int m = (l+h)/2;
            if(sumByD(nums, m) <= threshold) {
                ans = m;
                h = m-1;
            }
            else l = m+1;
        }
        return ans;
    }
};