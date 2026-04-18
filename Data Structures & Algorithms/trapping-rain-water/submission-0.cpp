class Solution {
public:
    int trap(vector<int>& height) {
        vector<int> lmx,rmx;
        int n = height.size();
        int lx = height[0];
        int rx = height[n-1];
        int ans =0;
        for(int i =0 ;i<n;i++){
            lx = max(height[i],lx);
            lmx.push_back(lx);
        }
        for(int i=n-1;i>=0;i-- ){
            rx =  max(height[i],rx);
            rmx.push_back(rx);
        }
        reverse(rmx.begin(),rmx.end());
        for(int i =0;i<n;i++){
            std::cout<<lmx[i]<<"--"<<rmx[i]<<endl;
            ans += min(lmx[i],rmx[i])-height[i];
        }
        return ans;
    }
};
