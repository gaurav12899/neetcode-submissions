class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        set<int> mset(nums.begin(),nums.end());
        int mxans =0;
        for(int elt : mset){
            if(mset.find(elt-1)==mset.end()){
                int ans =1;
                int sp = elt;
                while(mset.find(sp+1)!=mset.end()){
                    ans++;
                    sp++;
                }
                mxans = max(ans,mxans);
            }
        }
        return mxans;
    }
};
