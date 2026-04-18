class Solution {
public:
    bool isAnagram(string a, string b) {
        vector<int> vec(26,0);
        for(char s: a){
            vec[s-'a']+=1;
        }
        for(char s: b){
            vec[s-'a']-=1;
        }
        for(int i : vec){
            if(i!=0)return false;
        }
        return true;
    }
};
