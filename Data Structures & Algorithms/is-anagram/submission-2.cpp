class Solution {
public:
    bool isAnagram(string a, string b) {
        vector<int> vec(26,0);
        if(a.size()!=b.size())return false;

        for(int i =0;i<a.size();i++){
            vec[a[i]-'a']+=1;
            vec[b[i]-'a']-=1;

        }
        for(int i : vec){
            if(i!=0)return false;
        }
        return true;
    }
};
