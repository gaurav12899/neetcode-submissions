class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string,vector<string>> mp;
        for(string s : strs){
            vector<int> vec(26,0);
            for(char c: s) vec[c-'a']++;
            string key="";
            for(int i : vec){
                key+='#';
                key+=to_string(i);
            }
            mp[key].push_back(s);
        }
        vector<vector<string>> result;
        for(const auto& entry: mp){
            result.push_back(entry.second);
        }
        return result;
        
    }
};
