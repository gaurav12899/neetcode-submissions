class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        unordered_map<int,int> mp;
        for(int n:nums) mp[n]+=1;
        vector<vector<int>>vec(nums.size()+1);
        for(auto const& [element,freq]:mp){
            vec[freq].push_back(element);
        }
        vector<int> result;
        for(int i= nums.size();i>=1 && k>result.size();i--){
            for(int num:vec[i]){
            result.push_back(num);
            }
        }
        return result;

    }
};
