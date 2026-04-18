class Solution {
public:
    int trap(vector<int>& height) {
        int n=height.size();
        int lmx =0,rmx=height[n-1];
        int left =0,right = n-1;
        int ans=0;
        while(left<right){
            if(height[left]<height[right]){
                if(lmx<height[left]){
                    lmx=height[left];
                }else{
                    ans+=lmx-height[left];
                }
                left++;
            }else{
                if(rmx<height[right]){
                    rmx = height[right];
                }else{
                    ans+=rmx-height[right];
                }
                right--;
            }
        }
        return ans;
;    }
};
